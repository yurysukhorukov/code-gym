package dev.sukhorukov.architecture.creational.singleton.goodsingleton;

public class GoodSingleton {

  private GoodSingleton() {
    System.out.println("lazy creation");
  }

  static GoodSingleton getInstance() {
    System.out.println("getInstance");
    return SingletonHolder.instance;
  }

  private static class SingletonHolder {

    static {
      System.out.println("init SingletonHolder");
    }

    static final GoodSingleton instance = new GoodSingleton();
  }

  static class SingletonDemo {

    public static void main(String[] args) {
      System.out.println("--- begin ---");
      System.out.println("- singleton 1");
      GoodSingleton singleton1 = GoodSingleton.getInstance();

      System.out.println();
      System.out.println("- singleton 2");
      GoodSingleton singleton2 = GoodSingleton.getInstance();

      System.out.println();
      System.out.printf("singleton1 == singleton2 => %b%n", singleton1 == singleton2);
      System.out.println(singleton1);
      System.out.println(singleton2);
      System.out.println("---end ---");
    }
  }
}
