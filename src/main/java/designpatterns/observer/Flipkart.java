package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
    private static Flipkart instance = null;
    private List<Subscriber> subscribers = new ArrayList<>();

    private Flipkart() {}

    public static Flipkart getInstance() {
        if(instance == null) {
            instance = new Flipkart();
        }
        return instance;
    }
    public void orderPlaced() {
        for(Subscriber subscriber : subscribers) {
            subscriber.announce();
        }
    }
    void registerSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }
    void unregisterSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }
}
