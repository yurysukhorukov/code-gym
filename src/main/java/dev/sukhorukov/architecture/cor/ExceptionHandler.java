package dev.sukhorukov.architecture.cor;

public interface ExceptionHandler {

  void setNext(ExceptionHandler handler);

  void handle(String request);
}
