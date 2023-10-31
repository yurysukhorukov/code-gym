package dev.sukhorukov.architecture.structural.composite;

import lombok.Data;

@Data
public class PlaneUnit implements
    Movable {

  private int moveHexCount = 20;

  @Override
  public void move() {
    System.out.printf("Самолеты летят на %d гексов %n", moveHexCount);
  }

  @Override
  public void setupMoveHexCount(int moveHexCount) {
    this.moveHexCount = moveHexCount;
  }

  @Override
  public int getHexCount() {
    return moveHexCount;
  }
}
