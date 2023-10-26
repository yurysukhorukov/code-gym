package dev.sukhorukov.architecture.behavioral.command;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Light {
  // Aka Receiver

  private int bulbAmount;
  private int powerWatt;
  private final String room;

  void turnOn() {
    System.out.println("Light is on in " + room);
  }

  void turnOff() {
    System.out.println("Light is off in " + room);
  }
}
