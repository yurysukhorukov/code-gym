package dev.sukhorukov.architecture.behavioral.strategy;

import lombok.Data;

@Data
public class Context {

  private Strategy strategy;

  void applyStrategy() {
    strategy.transportation();
  }
}
