package dev.sukhorukov.architecture.creational.singleton.lazysingleton;

public class Demo {

  public static void main(String[] args) {
    LazySingleton lazySingleton1 = LazySingleton.getInstance();
    LazySingleton lazySingleton2 = LazySingleton.getInstance();

    System.out.println("Возвращается дважды один и тот же объект: ");
    System.out.println(lazySingleton1);
    System.out.println(lazySingleton2);
  }

}
