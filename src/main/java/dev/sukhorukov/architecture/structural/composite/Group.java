package dev.sukhorukov.architecture.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Group implements Movable {

  private List<Movable> groupOfUnits = new ArrayList<>();
  private int moveHexCountLimit;

  @Override
  public void move() {
    groupOfUnits.forEach(Movable::move);
  }

  @Override
  public void setupMoveHexCount(int moveHexCount) {
    this.moveHexCountLimit = moveHexCount;
  }

  @Override
  public int getHexCount() {
    return moveHexCountLimit;
  }

  public void addUnit(Movable unit) {
    final int hexCount = unit.getHexCount();
    Optional<Movable> lowesMoveUnit = groupOfUnits.stream().filter(u -> u.getHexCount() < hexCount)
        .findAny();

    if (lowesMoveUnit.isEmpty()) {
      this.setupMoveHexCount(hexCount);
      groupOfUnits.forEach(u -> u.setupMoveHexCount(hexCount));
    }

    groupOfUnits.add(unit);
  }
}
