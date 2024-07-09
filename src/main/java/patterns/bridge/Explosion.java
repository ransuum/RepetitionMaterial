package patterns.bridge;

public class Explosion implements Acceleration{
    @Override
    public void accelerate() {
        System.out.print("explosion");
    }
}
