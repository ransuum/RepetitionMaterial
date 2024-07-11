package patterns.state;

public class BadHealthyState implements HealthState{
    @Override
    public void exercise(Human human) {
        System.out.println("not exercising`");
    }

    @Override
    public void takeMedicine(Human human) {
        System.out.println("ill and take medicine");
    }

    @Override
    public void sleep(Human human) {
        System.out.println("sleeping less than 7 hours");
        human.setH(new RecoveringState());
    }
}
