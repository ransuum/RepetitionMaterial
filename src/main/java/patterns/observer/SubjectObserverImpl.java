package patterns.observer;

public class SubjectObserverImpl implements Observer{
    private String name;

    public SubjectObserverImpl(String name) {
        this.name = name;
    }

    public SubjectObserverImpl() {
    }

    @Override
    public void update(String message) {
        System.out.println(name + " get message: " + message);
    }
}
