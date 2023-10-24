package dev.sukhorukov.architecture.command;

import lombok.Data;

@Data
public class LightTurnOnCommand implements Command {
  // Aka ConcreteCommand

  @Override
  public void execute(Light light) {
    light.turnOn();
  }
}
