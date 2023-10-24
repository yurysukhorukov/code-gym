package dev.sukhorukov.architecture.cor;

public class HighLevelExceptionHandler extends BaseHandler {

  @Override
  public void handle(String request) {
    if (request.equals("HIGH")) {
      System.out.println("Пишем ошибку в лог...");
      System.out.println("Отправляем емейл разработчику...");
      System.out.println("Отправляем SMS менеджеру...");
    } else {
      super.handle(request);
    }
  }
}
