package dev.sukhorukov.architecture.creational.singleton.nonlazysingleton;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class NonLazySingleton {

  /* Несмотря на то, что такой синглтон не вызовет проблем в многопоточной среде
  здесь проблема в том, что это не lazy инииализация - объект всегда создается сразу,
  а не при обращении к нему. Объект может быть большим и загрузка сразу может быть
  не желательна
   */
  private static final NonLazySingleton NON_LAZY_SINGLETON = new NonLazySingleton();

  public static NonLazySingleton getInstance() {
    return NON_LAZY_SINGLETON;
  }
}
