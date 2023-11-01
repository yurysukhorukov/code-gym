package dev.sukhorukov.architecture.structural.flyweight;

public class FlyweightFactory {

  private final CommonHeavyPart commonHeavyPart;

  public FlyweightFactory() {
    this.commonHeavyPart = new CommonHeavyPart();
  }

  public Context create(int x) {
    return new Context(commonHeavyPart, x);
  }
}
