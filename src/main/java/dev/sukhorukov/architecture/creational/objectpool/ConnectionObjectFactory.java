package dev.sukhorukov.architecture.creational.objectpool;

public class ConnectionObjectFactory implements
    PoolObjectFactory<Connection> {

  @Override
  public Connection create() {
    System.out.println("Create new Connection");
    return new ConnectionPostgres();
  }
}
