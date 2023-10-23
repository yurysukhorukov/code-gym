package dev.sukhorukov.architecture.observer;

public class ConcreteSubscriber2 {

  /*
  Большой и жирный класс со множеством полей
   */

  private static final Subscriber subscriber =
      data -> System.out.println("Subscriber 2 has received new state: " + data.getMainState());

  public Subscriber getSubscriber() {
    return subscriber;
  }
}
