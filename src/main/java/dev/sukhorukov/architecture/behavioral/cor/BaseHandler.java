package dev.sukhorukov.architecture.behavioral.cor;

import lombok.Data;

@Data
public class BaseHandler implements ExceptionHandler {

  private ExceptionHandler nextHandler;

  @Override
  public void setNext(ExceptionHandler handler) {
    this.nextHandler = handler;
  }

  @Override
  public void handle(String request) {
    if (nextHandler != null) {
      nextHandler.handle(request);
    }
  }
}
