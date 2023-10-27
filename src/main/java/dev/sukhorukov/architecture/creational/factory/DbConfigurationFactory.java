package dev.sukhorukov.architecture.creational.factory;

public class DbConfigurationFactory implements Factory {

  @Override
  public Configuration createConfiguration() {
    return new DBConfiguration();
  }
}
