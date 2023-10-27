package dev.sukhorukov.architecture.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CopyablePotato implements Copyable<CopyablePotato> {

  private String name;

  @Override
  public CopyablePotato copy() {
    return new CopyablePotato(name);
  }
}
