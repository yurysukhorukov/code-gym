package dev.sukhorukov.architecture.structural.composite;

public class Demo {

  public static void main(String[] args) {
    Group groupOfUnits = new Group();
    PlaneUnit planeUnit = new PlaneUnit();
    TankUnit tankUnit = new TankUnit();

    // По отдельности юниты ходят на разное количество гексов
    planeUnit.move();
    tankUnit.move();

    System.out.println("------------");

    // Добавляем в группу несколько юнитов
    groupOfUnits.addUnit(new PlaneUnit());
    groupOfUnits.addUnit(new PlaneUnit());
    groupOfUnits.addUnit(new TankUnit());

    /* Вызываем логику передвижения группы, причем в Group мы можем задать логику характерную
    именно группе - например вся группа ограничена длиной самого минимального хода одного из юнитов
    */
    groupOfUnits.move();
  }
}
