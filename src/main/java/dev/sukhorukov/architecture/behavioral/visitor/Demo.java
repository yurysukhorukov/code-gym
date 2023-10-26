package dev.sukhorukov.architecture.behavioral.visitor;

public class Demo {

  public static void main(String[] args) {
    final Visitor visitor = new InsurerVisitor();
    visitor.visit(new Bank());
    visitor.visit(new Manufacture());
    visitor.visit(new PrivateHouse());
  }
}
