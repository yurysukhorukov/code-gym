package dev.sukhorukov.architecture.structural.proxy.security;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SecurityAccessProxy implements
    SecurityAccess {

  private SecurityAccess securityAccess;


  // Обрамили дополнительными функциями вызов основного метода, также с логированием
  @Override
  public void access() {
    System.out.println("before giving access");
    securityAccess.access();
    System.out.println("after");
  }
}
