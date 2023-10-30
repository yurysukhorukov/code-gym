package dev.sukhorukov.architecture.creational.objectpool;

import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Consumer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ObjectPool<T> {

  private final int maxSize;
  private final PoolObjectFactory<T> poolObjectFactory;
  private final Consumer<T> pooledObjectInitializer;

  private final Queue<T> free = new LinkedList<>();
  private final Queue<T> used = new LinkedList<>();

  ObjectPool(int initialSize, int maxSize, PoolObjectFactory<T> poolObjectFactory,
      Consumer<T> pooledObjectInitializer) {
    this.maxSize = maxSize;
    this.poolObjectFactory = poolObjectFactory;
    this.pooledObjectInitializer = pooledObjectInitializer;

    initPool(initialSize);
  }

  private void initPool(int initialSize) {
    for (int i = 0; i < initialSize; i++) {
      T obj = poolObjectFactory.create();
      pooledObjectInitializer.accept(obj);
      free.add(obj);
    }
  }

  /**
   * Получение объекта из пула.
   */
  public T get() {
    var freeBefore = free.size();
    var usedBefore = used.size();

    T obj = free.poll();
    if (obj == null) {
      if (used.size() == this.maxSize) {
        throw new ObjectPoolMaxSizeException(maxSize);
      }

      obj = poolObjectFactory.create();
      pooledObjectInitializer.accept(obj);
    }
    used.offer(obj);

    System.out.printf(
        "get() free=%d used=%d | free=%d used=%d%n", freeBefore, usedBefore, free.size(),
        used.size());
    return obj;
  }

  /**
   * Возвращение объекта в пул.
   */
  public void release(T obj) {
    var freeBefore = free.size();
    var usedBefore = used.size();

    used.remove(obj);
    free.add(obj);

    System.out.printf(
        "release() free=%d used=%d | free=%d used=%d%n", freeBefore, usedBefore, free.size(),
        used.size());
  }

}

class ObjectPoolMaxSizeException extends RuntimeException {

  public ObjectPoolMaxSizeException(int maxSize) {
    super("Cannot create object. Reached maximum pool size of " + maxSize + " objects");
  }
}
