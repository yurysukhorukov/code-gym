package dev.sukhorukov.architecture.structural.composite;

import lombok.Data;

@Data
public class TankUnit implements Movable {

  private int moveHexCount = 14;

  @Override
  public void move() {
    System.out.printf("Танки едут на %d гексов %n", moveHexCount);
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
