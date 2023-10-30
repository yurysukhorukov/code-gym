package dev.sukhorukov.architecture.creational.singleton.nonlazysingleton;

public class Demo {

  public static void main(String[] args) {
    NonLazySingleton nonLazySingleton1 = NonLazySingleton.getInstance();
    NonLazySingleton nonLazySingleton2 = NonLazySingleton.getInstance();

    System.out.println("Возвращается дважды один и тот же объект: ");
    System.out.println(nonLazySingleton1);
    System.out.println(nonLazySingleton2);
  }
}
