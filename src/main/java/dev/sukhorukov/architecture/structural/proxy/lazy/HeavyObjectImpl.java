package dev.sukhorukov.architecture.structural.proxy.lazy;

import lombok.ToString;

@ToString
public class HeavyObjectImpl implements
    HeavyObject {

  private String value;
  private boolean isInit;

  @Override
  public String getValue() {
    return this.value;
  }

  @Override
  public void init(String value) {
    this.value = value;
    isInit = true;
    System.out.println("heavy long initialization...");
  }

  @Override
  public boolean isInit() {
    return isInit;
  }
}
