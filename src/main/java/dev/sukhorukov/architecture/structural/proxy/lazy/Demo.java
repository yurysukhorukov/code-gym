package dev.sukhorukov.architecture.structural.proxy.lazy;

public class Demo {

  public static void main(String[] args) {
    runLazyExample();
  }

  private static void runLazyExample() {
    HeavyObject heavyObject = new HeavyObjectImpl();
    System.out.println(heavyObject);

    LazyProxy lazyProxy = new LazyProxy(heavyObject);
    //Отдаем heavy object и не беспокоимся. Теперь при обращении к прокси, он его проинициализирует
    //(предварительно удостоверившись, что инициализации еще не было) и отдаст готовый
    System.out.println(lazyProxy.getValue());
    System.out.println(heavyObject);
    System.out.println(heavyObject.getValue());
  }
}
