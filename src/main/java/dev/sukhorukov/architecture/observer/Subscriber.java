package dev.sukhorukov.architecture.observer;

public interface Subscriber {
    void update(Publisher publisher);
}
