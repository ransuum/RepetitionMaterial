package patterns.state;

public class RecoveringState implements HealthState {
    @Override
    public void exercise(Human human) {
        System.out.println("Exercising lightly to regain strength.");
        human.setH(new HealthyState());
    }

    @Override
    public void takeMedicine(Human human) {
        System.out.println("Taking more medicine to speed up recovery.");
    }

    @Override
    public void sleep(Human human) {
        System.out.println("Sleeping well to recover fully.");
    }
}
