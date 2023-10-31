package dev.sukhorukov.architecture.structural.facade;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Facade {

  private final SomeComplicatedSystemClass complicatedSystemClass;
  private final AnotherComplicatedSystemClass anotherComplicatedSystemClass;

  void doComplicatedThingsLookSimple() {
    complicatedSystemClass.method1();
    complicatedSystemClass.method3();
    anotherComplicatedSystemClass.methodB();
  }
}
