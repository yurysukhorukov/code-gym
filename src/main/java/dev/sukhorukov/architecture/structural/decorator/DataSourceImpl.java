package dev.sukhorukov.architecture.structural.decorator;

public class DataSourceImpl implements
    DataSource {

  @Override
  public int execute() {
    return 20 + 2;
  }
}
