package dev.sukhorukov.architecture.structural.bridge;

public class MasterCardPaymentSystem implements
    PaymentSystem {

  @Override
  public String psType() {
    return "MasterCard";
  }
}
