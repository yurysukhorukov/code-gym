package dev.sukhorukov.architecture.structural.decorator;

public class DataSourceMultiplierDecorator extends
    BaseDataSourceDecorator {

  public DataSourceMultiplierDecorator(DataSource dataSource) {
    super(dataSource);
  }

  @Override
  public int execute() {
    return multiplyOperation(super.execute());
  }

  private int multiplyOperation(int i) {
    return i * 2;
  }
}
