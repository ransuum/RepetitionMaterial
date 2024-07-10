package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private String message;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer ->
                observer.update(message));
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}
