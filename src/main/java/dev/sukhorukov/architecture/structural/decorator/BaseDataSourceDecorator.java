package dev.sukhorukov.architecture.structural.decorator;

public class BaseDataSourceDecorator implements DataSource {

  private final DataSource dataSource;

  public BaseDataSourceDecorator(DataSource dataSource) {
    System.out.println("\n" + this);
    this.dataSource = dataSource;
  }

  @Override
  public int execute() {
    return dataSource.execute();
  }
}
