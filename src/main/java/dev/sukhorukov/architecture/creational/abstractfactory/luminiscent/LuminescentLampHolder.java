package dev.sukhorukov.architecture.creational.abstractfactory.luminiscent;

import dev.sukhorukov.architecture.creational.abstractfactory.LampHolder;

public class LuminescentLampHolder implements LampHolder {

  @Override
  public void showSocketName() {
    System.out.println("My socket is E28");
  }
}
