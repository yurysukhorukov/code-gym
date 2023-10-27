package dev.sukhorukov.architecture.creational.factory;

public interface Factory {

  Configuration createConfiguration();

  static Factory getConfigurationFactory(String configName) {
    if ("file".equalsIgnoreCase(configName)) {
      return new FileConfigurationFactory();
    } else if ("db".equalsIgnoreCase(configName)) {
      return new DbConfigurationFactory();
    } else {
      throw new IllegalArgumentException("Unsupported configuration name: " + configName);
    }
  }

}
