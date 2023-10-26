package dev.sukhorukov.architecture.behavioral.state;

public class YellowLightState implements State {

  @Override
  public State handle() {
    System.out.println("Горит желтый свет");
    return StateProvider.RED_LIGHT_STATE;
  }
}
