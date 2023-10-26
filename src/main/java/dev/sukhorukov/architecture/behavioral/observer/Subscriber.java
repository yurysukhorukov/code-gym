package dev.sukhorukov.architecture.behavioral.observer;

public interface Subscriber {
  void update(Publisher publisher);
}
