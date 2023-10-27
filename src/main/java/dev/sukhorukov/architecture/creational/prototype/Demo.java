package dev.sukhorukov.architecture.creational.prototype;

import lombok.SneakyThrows;

public class Demo {

  @SneakyThrows
  public static void main(String[] args) {
    CopyablePotato copyablePotato = new CopyablePotato("Potato I");
    CopyablePotato copyablePotato2 = copyablePotato.copy();

    copyablePotato2.setName("Potato II");

    System.out.println("Original: " + copyablePotato);
    System.out.println("Cloned: " + copyablePotato2);
    System.out.println("After copy we can see that they are different objects...");
    System.out.println("Original name: " + copyablePotato.getName());
    System.out.println("Cloned name: " + copyablePotato2.getName());

    CloneablePotato originalCloneable = new CloneablePotato("Original Cloneable",
        new PotatoBreed("Crvena", 150));
    CloneablePotato clonedPotato = originalCloneable.clone();

    System.out.println(
        "Original potato breed color: " + originalCloneable.getPotatoBreed().getColor());
    System.out.println(
        "Cloned potato breed color: " + originalCloneable.getPotatoBreed().getColor());

    System.out.println("Change color for original to Bielo...");

    originalCloneable.getPotatoBreed().setColor("Bielo");

    System.out.println("Color changed for cloned object as well due to shallow copy: "
        + clonedPotato.getPotatoBreed().getColor());

  }

}
