package dev.sukhorukov.architecture.creational.factory;

public class DBConfiguration implements
    Configuration {

  @Override
  public void doStuff() {
    System.out.println("Getting configuration from database...");
  }
}
