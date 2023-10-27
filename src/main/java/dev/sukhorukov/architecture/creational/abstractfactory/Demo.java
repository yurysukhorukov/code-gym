package dev.sukhorukov.architecture.creational.abstractfactory;

public class Demo {

  public static void main(String[] args) {
    Demo demo = new Demo();

    AbstractFactory ledFactory = AbstractFactory.configuration("led");
    AbstractFactory luminescentFactory = AbstractFactory.configuration("luminescent");

    demo.run(ledFactory);
    demo.run(luminescentFactory);
  }

  public void run(AbstractFactory factory) {
    final var bulb = factory.createBulb();
    final var lampHolder = factory.createLampHolder();

    bulb.lightOn();
    lampHolder.showSocketName();
  }
}
