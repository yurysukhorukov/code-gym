package dev.sukhorukov.architecture.structural.facade;

public class Demo {

  public static void main(String[] args) {
    Facade facade = new Facade(new SomeComplicatedSystemClass(),
        new AnotherComplicatedSystemClass());

    facade.doComplicatedThingsLookSimple();
  }
}
