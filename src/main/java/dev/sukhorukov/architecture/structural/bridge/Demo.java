package dev.sukhorukov.architecture.structural.bridge;

public class Demo {

  public static void main(String[] args) {
    Card card1 = new CreditCard(new VisaPaymentSystem());
    Card card2 = new DebitCard(new MasterCardPaymentSystem());
    Card card3 = new DebitCard(new VisaPaymentSystem());

    card1.cardType();
    card2.cardType();
    card3.cardType();
  }
}
