package dev.sukhorukov.architecture.behavioral.memento;

import java.time.LocalDateTime;

public record Memento(State state, LocalDateTime createdAt) {

  public Memento(State state, LocalDateTime createdAt) {
    this.state = new State(state);
    this.createdAt = createdAt;
  }
}
