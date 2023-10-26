package dev.sukhorukov.architecture.behavioral.cor;

public interface ExceptionHandler {

  void setNext(ExceptionHandler handler);

  void handle(String request);
}
