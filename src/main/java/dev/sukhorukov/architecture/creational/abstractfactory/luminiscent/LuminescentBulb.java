package dev.sukhorukov.architecture.creational.abstractfactory.luminiscent;

import dev.sukhorukov.architecture.creational.abstractfactory.Bulb;

public class LuminescentBulb implements Bulb {

  @Override
  public void lightOn() {
    System.out.println("Luminescent lamp is ON");
  }
}
