package dev.sukhorukov.architecture.creational.abstractfactory.led;

import dev.sukhorukov.architecture.creational.abstractfactory.Bulb;

public class LedBulb implements Bulb {

  @Override
  public void lightOn() {
    System.out.println("Led lamp is ON");
  }
}
