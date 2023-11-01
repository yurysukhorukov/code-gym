package dev.sukhorukov.architecture.structural.proxy.lazy;

public interface HeavyObject {

  String getValue();

  void init(String value);

  boolean isInit();

}
