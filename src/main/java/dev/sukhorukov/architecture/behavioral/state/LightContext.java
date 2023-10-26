package dev.sukhorukov.architecture.behavioral.state;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LightContext {

  private State state;

  void performAction() {
    state = state.handle();
  }
}
