package dev.sukhorukov.architecture.behavioral.strategy;

public class Demo {

  public static void main(String[] args) {
    var transportationContext = new Context();

    transportationContext.setStrategy(new BusTransportationStrategy());
    transportationContext.applyStrategy();

    transportationContext.setStrategy(new CarTransportationStrategy());
    transportationContext.applyStrategy();

    transportationContext.setStrategy(new TaxiTransportationStrategy());
    transportationContext.applyStrategy();

    transportationContext.setStrategy(() -> System.out.println("Fly by rocket"));
    transportationContext.applyStrategy();
  }
}
