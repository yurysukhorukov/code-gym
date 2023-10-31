package dev.sukhorukov.architecture.structural.decorator;

public class Demo {

  public static void main(String[] args) {
    DataSource dataSource = new DataSourceImpl();
    printer(dataSource);

    printer(new BaseDataSourceDecorator(dataSource));
    printer(new BaseDataSourceDecorator(new DataSourceAdderDecorator(dataSource)));
    printer(new BaseDataSourceDecorator(
        new DataSourceAdderDecorator(new DataSourceMultiplierDecorator(dataSource))));
  }

  private static void printer(DataSource ds) {
    System.out.println(ds.execute());
  }

}
