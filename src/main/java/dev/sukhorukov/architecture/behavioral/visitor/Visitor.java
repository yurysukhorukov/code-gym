package dev.sukhorukov.architecture.behavioral.visitor;

public interface Visitor {

  void visit(Bank bank);

  void visit(Manufacture manufacture);

  void visit(PrivateHouse privateHouse);
}
