package dev.sukhorukov.architecture.behavioral.visitor;

public class Bank implements Component {

  String respondToInsurer() {
    return "Hi I'm bank manager. I'm ready to buy: ";
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
