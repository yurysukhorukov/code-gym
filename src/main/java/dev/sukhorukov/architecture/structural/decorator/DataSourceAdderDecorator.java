package dev.sukhorukov.architecture.structural.decorator;

public class DataSourceAdderDecorator extends
    BaseDataSourceDecorator {

  public DataSourceAdderDecorator(DataSource dataSource) {
    super(dataSource);
  }

  @Override
  public int execute() {
    return addOperation(super.execute());
  }

  private int addOperation(int i) {
    return i + 20;
  }
}
