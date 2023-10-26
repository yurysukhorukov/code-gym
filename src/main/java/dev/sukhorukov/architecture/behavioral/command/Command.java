package dev.sukhorukov.architecture.behavioral.command;

@FunctionalInterface
public interface Command {
  void execute(Light light);
}
