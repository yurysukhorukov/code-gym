package dev.sukhorukov.architecture.behavioral.strategy;

public class CarTransportationStrategy implements
    Strategy {

  @Override
  public void transportation() {
    System.out.println("Go to airport by car");
  }
}
