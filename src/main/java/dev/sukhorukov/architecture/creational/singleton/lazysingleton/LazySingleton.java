package dev.sukhorukov.architecture.creational.singleton.lazysingleton;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LazySingleton {

  /*
  Здесь singleton lazy, но здесь потенциальная проблема в многопоточной среде
   */
  private static LazySingleton lazySingleton = null;

  public static LazySingleton getInstance() {
    // В многопоточной среде здесь должен быть thread lock иначе внутрь метода могут попасть
    // два потока и это приведет к двум инстансам класса
    if (lazySingleton == null) {
      lazySingleton = new LazySingleton();
    }
    return lazySingleton;
  }
}
