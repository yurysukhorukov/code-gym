package dev.sukhorukov.architecture.creational.factory;

public class FileConfigurationFactory implements
    Factory {

  @Override
  public Configuration createConfiguration() {
    return new FileConfiguration();
  }
}
