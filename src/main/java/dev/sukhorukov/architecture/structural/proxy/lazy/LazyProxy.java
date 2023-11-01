package dev.sukhorukov.architecture.structural.proxy.lazy;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@RequiredArgsConstructor
public class LazyProxy implements
    HeavyObject {

  private final HeavyObject heavyObject;

  @Override
  public String getValue() {
    if (!heavyObject.isInit()) {
      heavyObject.init("bigVal");
    }
    return heavyObject.getValue();
  }

  @Override
  public void init(String value) {
    heavyObject.init(value);
  }

  @Override
  public boolean isInit() {
    return heavyObject.isInit();
  }
}
