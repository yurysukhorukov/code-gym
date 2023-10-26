package dev.sukhorukov.architecture.behavioral.visitor;

public class Manufacture implements
    Component {

  String respondToInsurer() {
    return "Hi I'm owner of this manufacture. I'm ready to buy: ";
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
