package dev.sukhorukov.architecture.behavioral.cor;

public class LowLevelExceptionHandler extends BaseHandler {

  @Override
  public void handle(String request) {
    if (request.equals("LOW")) {
      System.out.println("Пишем ошибку в лог...");
    } else {
      super.handle(request);
    }
  }
}
