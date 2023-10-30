package dev.sukhorukov.architecture.structural.adapter;

public class Demo {

  public static void main(String[] args) {
    RotaryHammer rotaryHammer = new RotaryHammer();

    // Теперь можно сверлить передав старое дедовское сверло!
    rotaryHammer.work(new SDSAdapter(new Drill()));

    // Можно передать свое SDS сверло из лямбды
    rotaryHammer.work(() -> System.out.println("Сверлим SDS сверлом из лямбды"));
  }

}
