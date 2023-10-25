package dev.sukhorukov.architecture.memento;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Demo {

  public static void main(String[] args) {
    Originator originator = new Originator(LocalDateTime::now);
    var state = new State(new String[]{"A", "B", "C"});

    originator.save(state);
    System.out.println(Arrays.toString(state.getStringArray()));

    state.getStringArray()[0] = "A1";
    originator.save(state);
    System.out.println(Arrays.toString(state.getStringArray()));

    state.getStringArray()[0] = "A2";
    originator.save(state);
    System.out.println(Arrays.toString(state.getStringArray()));

    state.getStringArray()[0] = "A3";
    originator.save(state);
    System.out.println(Arrays.toString(state.getStringArray()));

    State restoredState1 = originator.restore();
    System.out.println(Arrays.toString(restoredState1.getStringArray()));

    State restoredState2 = originator.restore();
    System.out.println(Arrays.toString(restoredState2.getStringArray()));

    State restoredState3 = originator.restore();
    System.out.println(Arrays.toString(restoredState3.getStringArray()));

    State restoredState4 = originator.restore();
    System.out.println(Arrays.toString(restoredState4.getStringArray()));
  }
}
