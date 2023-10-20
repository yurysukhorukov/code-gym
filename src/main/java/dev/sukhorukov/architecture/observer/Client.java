package dev.sukhorukov.architecture.observer;

public class Client {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        publisher.subscribe(new ConcreteSubscriber1());
        publisher.subscribe(new ConcreteSubscriber2());

        publisher.changeMainState("I'm Publisher, and this is my new state");
    }
}
