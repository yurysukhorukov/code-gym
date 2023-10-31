package dev.sukhorukov.architecture.structural.composite;

public interface Movable {

  void move();

  void setupMoveHexCount(int moveHexCount);

  int getHexCount();
}
