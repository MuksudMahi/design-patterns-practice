package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer>observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        observers.forEach(Observer::update);
    }
}
