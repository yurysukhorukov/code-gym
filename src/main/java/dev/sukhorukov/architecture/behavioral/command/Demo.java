package dev.sukhorukov.architecture.behavioral.command;

public class Demo {
  // Aka Client

  public static void main(String[] args) {
    Light livingRoomLight = new Light("Living room");
    Executor executor = new Executor(livingRoomLight);

    executor.setCommand(new LightTurnOnCommand());
    executor.setCommand(new LightTurnOffCommand());

    // Можно не создавать класс для каждой отдельной комманды,а заменить лямбдой
    executor.setCommand(light -> livingRoomLight.turnOn());
    executor.setCommand(light -> livingRoomLight.turnOff());

    executor.executeCommands();
  }
}
