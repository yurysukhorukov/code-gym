package dev.sukhorukov.architecture.observer;

public class ConcreteSubscriber1 implements Subscriber {
    @Override
    public void update(Publisher publisher) {
        System.out.println("Subscriber 1 has received new state: " + publisher.getMainState());
    }
}
