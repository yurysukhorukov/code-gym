package dev.sukhorukov.architecture.structural.proxy.security;

public class Demo {

  public static void main(String[] args) {
    runSecurityExample();
  }

  private static void runSecurityExample() {
    SecurityAccess securityAccess = new SecurityAccessProxy(new SecurityAccessImpl());

    securityAccess.access();
  }
}
