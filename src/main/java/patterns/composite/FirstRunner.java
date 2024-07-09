package patterns.composite;

public class FirstRunner implements Speed{
    @Override
    public void speed(double speed) {
        System.out.println("First runner speed(km/h): " + speed);
    }
}
