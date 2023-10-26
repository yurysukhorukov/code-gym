package dev.sukhorukov.architecture.behavioral.memento;

import java.time.LocalDateTime;

@FunctionalInterface
public interface DateTimeProvider {

  LocalDateTime getCurrentTime();
}
