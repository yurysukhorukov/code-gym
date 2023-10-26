package dev.sukhorukov.architecture.behavioral.memento;

import java.util.ArrayDeque;
import java.util.Deque;
import lombok.Data;

@Data
public class Originator {

  private final Deque<Memento> historyStack = new ArrayDeque<>();
  private final DateTimeProvider dateTimeProvider;

  public Originator(DateTimeProvider dateTimeProvider) {
    this.dateTimeProvider = dateTimeProvider;
  }

  void save(State state) {
    historyStack.push(new Memento(state, dateTimeProvider.getCurrentTime()));
  }

  State restore() {
    if (!historyStack.isEmpty()) {
      var memento = historyStack.pop();
      System.out.println("createdAt: " + memento.createdAt());
      return memento.state();
    }
    return null;
  }
}
