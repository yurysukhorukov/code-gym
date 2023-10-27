package dev.sukhorukov.architecture.creational.abstractfactory.luminiscent;

import dev.sukhorukov.architecture.creational.abstractfactory.AbstractFactory;
import dev.sukhorukov.architecture.creational.abstractfactory.Bulb;
import dev.sukhorukov.architecture.creational.abstractfactory.LampHolder;

public class LuminescentFactory implements AbstractFactory {

  @Override
  public Bulb createBulb() {
    return new LuminescentBulb();
  }

  @Override
  public LampHolder createLampHolder() {
    return new LuminescentLampHolder();
  }
}
