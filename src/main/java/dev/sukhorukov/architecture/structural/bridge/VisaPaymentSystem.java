package dev.sukhorukov.architecture.structural.bridge;

public class VisaPaymentSystem implements
    PaymentSystem {

  @Override
  public String psType() {
    return "Visa";
  }
}
