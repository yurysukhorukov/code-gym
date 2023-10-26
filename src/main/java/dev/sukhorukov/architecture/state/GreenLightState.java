package dev.sukhorukov.architecture.state;

public class GreenLightState implements State {

  @Override
  public State handle() {
    System.out.println("Горит зеленый сигнал");
    return StateProvider.YELLOW_LIGHT_STATE;
  }
}
