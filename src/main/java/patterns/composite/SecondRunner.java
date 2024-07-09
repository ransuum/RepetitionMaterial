package patterns.composite;

public class SecondRunner implements Speed {

    @Override
    public void speed(double speed) {
        System.out.println("Second runner speed(km/h): " + speed);
    }
}
