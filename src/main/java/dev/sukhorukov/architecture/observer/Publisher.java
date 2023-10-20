package dev.sukhorukov.architecture.observer;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

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
        for (Subscriber s : subscriberList) {
            s.update(this);
        }
    }
}
