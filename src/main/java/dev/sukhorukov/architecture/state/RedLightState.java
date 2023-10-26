package dev.sukhorukov.architecture.state;

public class RedLightState implements State {

  @Override
  public State handle() {
    System.out.println("Горит красный свет");
    return StateProvider.GREEN_LIGHT_STATE;
  }
}
