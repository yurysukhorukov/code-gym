package dev.sukhorukov.architecture.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class Publisher {

  private List<Subscriber> subscriberList = new ArrayList<>();
  String mainState = "";

  boolean subscribe(Subscriber subscriber) {
    return subscriberList.add(subscriber);
  }

  boolean unsubscribe(Subscriber subscriber) {
    return subscriberList.remove(subscriber);
  }

  void changeMainState(String newState) {
    mainState = newState;
    notifySubscribers();
  }

  private void notifySubscribers() {
    subscriberList.forEach(
        subscriber -> {
          try {
            subscriber.update(this);
          } catch (Exception exception) {
            // Обработка исключения
          }
        });
  }
}
