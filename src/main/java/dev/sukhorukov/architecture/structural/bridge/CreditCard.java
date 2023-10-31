package dev.sukhorukov.architecture.structural.bridge;

public class CreditCard extends Card {

  public CreditCard(PaymentSystem paymentSystem) {
    super(paymentSystem);
  }

  @Override
  void cardType() {
    System.out.println("Credit card " + this.getPaymentSystem().psType());
  }
}
