package dev.sukhorukov.architecture.creational.builder;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
public class Car {

  private String color;
  private String type;
  private int powerKw;

  Car(CarBuilder carBuilder) {
    this.color = carBuilder.getColor();
    this.type = carBuilder.getModel();
    this.powerKw = carBuilder.getPowerKw();
  }

  CarBuilder builder() {
    return new CarBuilder();
  }

  @Getter(value = AccessLevel.PRIVATE)
  static class CarBuilder {

    private String color;
    private String model;
    private int powerKw;

    CarBuilder color(String color) {
      this.color = color;
      return this;
    }

    CarBuilder model(String type) {
      this.model = type;
      return this;
    }

    CarBuilder powerKw(int powerKw) {
      this.powerKw = powerKw;
      return this;
    }

    Car build() {
      return new Car(this);
    }
  }
}
