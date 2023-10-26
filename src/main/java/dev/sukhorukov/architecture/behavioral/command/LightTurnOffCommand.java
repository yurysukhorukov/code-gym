package dev.sukhorukov.architecture.behavioral.command;

import lombok.Data;

@Data
public class LightTurnOffCommand implements Command {
  // Aka ConcreteCommand

  @Override
  public void execute(Light light) {
    light.turnOff();
  }
}
