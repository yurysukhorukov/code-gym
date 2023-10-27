package dev.sukhorukov.architecture.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CloneablePotato implements Cloneable {

  private String name;
  private PotatoBreed potatoBreed;

  /*
  Object’s clone method is very tricky. It’s based on field copies, and it’s "extra-linguistic."
  It creates an object without calling a constructor. There are no guarantees that it preserves
  the invariants established by the constructors. There have been lots of bugs over the years,
  both in and outside Sun, stemming from the fact that if you just call super.clone repeatedly
  up the chain until you have cloned an object, you have a shallow copy of the object. The clone
  generally shares state with the object being cloned. If that state is mutable, you don’t have
  two independent objects. If you modify one, the other changes as well. And all of a sudden,
  you get random behavior.
   */
  @Override
  protected CloneablePotato clone() throws CloneNotSupportedException {
    /*
    Поля копируются но глубокой копии не происходит, то есть если в поле представлен
    объект скопируется лишь ссылка на него, в результате чего изменения в оригинальной
    версии будут менять состояние в копии.
     */
    return (CloneablePotato) super.clone();
  }
}
