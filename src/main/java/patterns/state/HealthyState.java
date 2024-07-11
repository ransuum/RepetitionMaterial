package patterns.state;

public class HealthyState implements HealthState {
    @Override
    public void exercise(Human human) {
        System.out.println("Exercising feeling great");
    }

    @Override
    public void takeMedicine(Human human) {
        System.out.println("No need for medicine, already healthy!");
    }

    @Override
    public void sleep(Human human) {
        System.out.println("sleepin 8+ h feeling great");
    }
}
