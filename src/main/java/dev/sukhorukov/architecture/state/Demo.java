package dev.sukhorukov.architecture.state;

public class Demo {

  public static void main(String[] args) {
    LightContext lightContext = new LightContext(new RedLightState());

    lightContext.performAction();
    lightContext.performAction();
    lightContext.performAction();
    lightContext.performAction();
  }
}
