package dev.sukhorukov.architecture.state;

import lombok.Getter;

@Getter
public class StateProvider {

  private StateProvider() {
  }

  public static final State GREEN_LIGHT_STATE = new GreenLightState();
  public static final State YELLOW_LIGHT_STATE = new YellowLightState();
  public static final State RED_LIGHT_STATE = new RedLightState();

}
