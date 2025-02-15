package behavioral.mediator.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    protected void notifyObservers() {
        observers.forEach(Observer::update);
    }
}
