package dev.sukhorukov.architecture.creational.abstractfactory;

import dev.sukhorukov.architecture.creational.abstractfactory.led.LedFactory;
import dev.sukhorukov.architecture.creational.abstractfactory.luminiscent.LuminescentFactory;

public interface AbstractFactory {

  Bulb createBulb();
  LampHolder createLampHolder();

  static AbstractFactory configuration(String param) {
    if ("led".equalsIgnoreCase(param)) {
      return new LedFactory();
    } else if ("luminescent".equalsIgnoreCase(param)) {
      return new LuminescentFactory();
    } else {
      throw new IllegalArgumentException("No factory for such param: " + param);
    }
  }
}
