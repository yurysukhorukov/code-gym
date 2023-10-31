package dev.sukhorukov.architecture.structural.bridge;

public class DebitCard extends Card {

  public DebitCard(PaymentSystem paymentSystem) {
    super(paymentSystem);
  }

  @Override
  void cardType() {
    System.out.println("Debit card " + this.getPaymentSystem().psType());
  }
}
