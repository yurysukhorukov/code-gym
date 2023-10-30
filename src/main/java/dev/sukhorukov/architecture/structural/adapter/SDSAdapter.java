package dev.sukhorukov.architecture.structural.adapter;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class SDSAdapter implements SDSDrill {

  private final Drill drill;

  @Override
  public void drill() {
    drill.drill();
    System.out.println("Пользуясь SDS адаптером...\n");
  }
}
