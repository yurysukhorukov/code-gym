package dev.sukhorukov.architecture.creational.abstractfactory.led;

import dev.sukhorukov.architecture.creational.abstractfactory.LampHolder;

public class LedLampHolder implements LampHolder {

  @Override
  public void showSocketName() {
    System.out.println("My socket is E14");
  }
}
