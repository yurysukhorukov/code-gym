package dev.sukhorukov.architecture.behavioral.strategy;

public class BusTransportationStrategy implements
    Strategy {

  @Override
  public void transportation() {
    System.out.println("Go to airport by bus");
  }
}
