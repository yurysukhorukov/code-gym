package dev.sukhorukov.architecture.creational.builder;

public class Demo {

  public static void main(String[] args) {
    Car car1 = new Car().builder().color("Grey").model("Mini Cooper").powerKw(158).build();
    System.out.println(car1.toString());

    Car car2 = new Car().builder().color("Beige").model("Volkswagen").powerKw(65).build();
    System.out.println(car2.toString());
  }

}
