package dev.sukhorukov.architecture.command;

@FunctionalInterface
public interface Command {
  void execute(Light light);
}
