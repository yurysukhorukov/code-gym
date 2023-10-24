package dev.sukhorukov.architecture.command;

import java.util.ArrayDeque;
import java.util.Queue;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Executor {
  // Aka Invoker

  private final Light light;

  // можно добавлять команды в очередь, иметь функционал undo и т.д.
  Queue<Command> commandQueue = new ArrayDeque<>();

  void setCommand(Command command) {
    commandQueue.add(command);
  }

  void executeCommands() {
    Command command;
    while ((command = commandQueue.poll()) != null) {
      command.execute(light);
    }
  }
}
