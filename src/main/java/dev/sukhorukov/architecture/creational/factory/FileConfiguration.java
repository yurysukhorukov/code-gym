package dev.sukhorukov.architecture.creational.factory;

public class FileConfiguration implements
    Configuration {

  @Override
  public void doStuff() {
    System.out.println("Getting configuration from file...");
  }
}
