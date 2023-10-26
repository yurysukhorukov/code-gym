package dev.sukhorukov.architecture.behavioral.visitor;

public class InsurerVisitor implements
    Visitor {

  @Override
  public void visit(Bank bank) {
    System.out.println(bank.respondToInsurer() + "Robbery insurance");
  }

  @Override
  public void visit(Manufacture manufacture) {
    System.out.println(manufacture.respondToInsurer() + "Flood and fire insurance");
  }

  @Override
  public void visit(PrivateHouse privateHouse) {
    System.out.println(privateHouse.respondToInsurer() + "Medical insurance");
  }
}
