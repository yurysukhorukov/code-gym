package dev.sukhorukov.architecture.creational.abstractfactory.led;

import dev.sukhorukov.architecture.creational.abstractfactory.AbstractFactory;
import dev.sukhorukov.architecture.creational.abstractfactory.Bulb;
import dev.sukhorukov.architecture.creational.abstractfactory.LampHolder;

public class LedFactory implements AbstractFactory {

  @Override
  public Bulb createBulb() {
    return new LedBulb();
  }

  @Override
  public LampHolder createLampHolder() {
    return new LedLampHolder();
  }
}
