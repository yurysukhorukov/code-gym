package dev.sukhorukov.architecture.behavioral.cor;

public class MediumLevelExceptionHandler extends BaseHandler {

  @Override
  public void handle(String request) {
    if (request.equals("MEDIUM")) {
      System.out.println("Пишем ошибку в лог...");
      System.out.println("Отправляем емейл разработчику...");
    } else {
      super.handle(request);
    }
  }
}
