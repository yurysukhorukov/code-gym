package dev.sukhorukov.architecture.cor;

public class Demo {

  public static void main(String[] args) {
    var lowLevelHandler = new LowLevelExceptionHandler();
    var mediumLevelHandler = new MediumLevelExceptionHandler();
    var highLevelHandler = new HighLevelExceptionHandler();

    lowLevelHandler.setNextHandler(mediumLevelHandler);
    mediumLevelHandler.setNextHandler(highLevelHandler);

    lowLevelHandler.handle("HIGH");
  }
}
