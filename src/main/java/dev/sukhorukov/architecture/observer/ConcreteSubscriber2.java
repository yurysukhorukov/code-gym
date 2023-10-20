package dev.sukhorukov.architecture.observer;

public class ConcreteSubscriber2 implements Subscriber {
    @Override
    public void update(Publisher publisher) {
        System.out.println("Subscriber 2 has received new state: " + publisher.getMainState());
    }
}
