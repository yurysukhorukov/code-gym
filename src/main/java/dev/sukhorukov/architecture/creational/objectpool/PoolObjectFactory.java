package dev.sukhorukov.architecture.creational.objectpool;

public interface PoolObjectFactory<T> {

  T create();
}
