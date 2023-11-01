package dev.sukhorukov.architecture.structural.flyweight;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString()
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class Context {

  private CommonHeavyPart commonHeavyPart;
  private int uniqueNumber;

}
