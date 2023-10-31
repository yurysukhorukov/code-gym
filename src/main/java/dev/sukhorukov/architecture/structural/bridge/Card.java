package dev.sukhorukov.architecture.structural.bridge;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public abstract class Card {

  private final PaymentSystem paymentSystem;

  abstract void cardType();
}
