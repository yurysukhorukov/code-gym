package dev.sukhorukov.architecture.behavioral.observer;

public class Client {
  public static void main(String[] args) {
    final Publisher publisher = new Publisher();
    final ConcreteSubscriber1 concreteSubscriber1 = new ConcreteSubscriber1();
    final ConcreteSubscriber2 concreteSubscriber2 = new ConcreteSubscriber2();

    publisher.subscribe(concreteSubscriber1);
    /* ConcreteSubscriber может не имплементировать Subscriber а содержать его реализацию внутри
    1. Это уместно в больших и увесистых классах, которые по смыслу больше чем просто Subscriber
    2. Это также уместно в целях перформанса, может получиться так что класс ConcreteSubscriber2 больше не нужен
        и GC мог бы его удалить из хипа, но т.к. он имплементирует Subscriber он будет храниться полностью, если же
        выделить Subscriber внутри отдельно (при этом избегая ссылок на ConcreteSubscriber2), то в хипе будет
        храниться только он */
    publisher.subscribe(concreteSubscriber2.getSubscriber());

    publisher.changeMainState("I'm Publisher, and this is my state A");
    publisher.changeMainState("I'm Publisher, and this is my state B");

    // Критически важно удалять подписчиков, когда не нужны
    publisher.unsubscribe(concreteSubscriber1);
    publisher.unsubscribe(concreteSubscriber2.getSubscriber());

    publisher.changeMainState("I'm Publisher, and this is my state C");
    publisher.changeMainState("I'm Publisher, and this is my state D");
  }
}
