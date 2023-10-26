package dev.sukhorukov.architecture.behavioral.visitor;

public class PrivateHouse implements
    Component {

  String respondToInsurer() {
    return "Hi I'm owner of this house. I'm ready to buy: ";
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
