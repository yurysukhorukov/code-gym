package dev.sukhorukov.architecture.behavioral.visitor;

public interface Component {

  void accept(Visitor visitor);
}
