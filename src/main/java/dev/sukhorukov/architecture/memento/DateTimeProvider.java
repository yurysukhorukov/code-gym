package dev.sukhorukov.architecture.memento;

import java.time.LocalDateTime;

@FunctionalInterface
public interface DateTimeProvider {

  LocalDateTime getCurrentTime();
}
