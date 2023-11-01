package dev.sukhorukov.architecture.structural.flyweight;

public class Demo {

  public static void main(String[] args) {
    FlyweightFactory factory = new FlyweightFactory();

    //таким образом ссылка CommonHeavyPart будет указывать на один и тот же объект для всех Context
    Context context = factory.create(15);
    System.out.println(context);

    Context context2 = factory.create(24);
    System.out.println(context2);

    Context context3 = factory.create(85);
    System.out.println(context3);
  }

}
