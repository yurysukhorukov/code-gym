package dev.sukhorukov.architecture.creational.factory;

public class Demo {

  public static void main(String[] args) {
    Configuration configuration = Factory.getConfigurationFactory("file").createConfiguration();

    configuration.doStuff();
  }

}
