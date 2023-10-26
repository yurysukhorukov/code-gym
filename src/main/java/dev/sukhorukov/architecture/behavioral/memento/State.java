package dev.sukhorukov.architecture.behavioral.memento;

import java.util.Arrays;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class State {

  private final String[] stringArray;

  State(State state) {
    this.stringArray = Arrays.copyOf(state.getStringArray(), state.getStringArray().length);
  }

}
