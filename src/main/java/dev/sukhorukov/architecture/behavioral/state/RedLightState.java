package dev.sukhorukov.architecture.behavioral.state;

public class RedLightState implements State {

  @Override
  public State handle() {
    System.out.println("Горит красный свет");
    return StateProvider.GREEN_LIGHT_STATE;
  }
}
