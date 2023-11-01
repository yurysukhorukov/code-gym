package dev.sukhorukov.architecture.structural.proxy.security;

public class SecurityAccessImpl implements
    SecurityAccess {

  @Override
  public void access() {
    System.out.println("Access to bank account");
  }
}
