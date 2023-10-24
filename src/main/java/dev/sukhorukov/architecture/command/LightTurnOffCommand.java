package dev.sukhorukov.architecture.command;

import lombok.Data;

@Data
public class LightTurnOffCommand implements Command {
  // Aka ConcreteCommand

  @Override
  public void execute(Light light) {
    light.turnOff();
  }
}
