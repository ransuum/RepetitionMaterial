package patterns.observer;

public class Main {
    public static void main(String[] args) {
        SubjectImpl s = new SubjectImpl();

        Observer observer = new SubjectObserverImpl("Math");
        Observer observer1 = new SubjectObserverImpl("Physics");

        s.attach(observer);
        s.attach(observer1);

        s.setMessage("dz 10.07.2024");

        s.detach(observer1);
        System.out.println("after detach");

        s.notifyObservers();
    }
}
