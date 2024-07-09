package patterns.bridge;

public class Successfully implements Acceleration{
    @Override
    public void accelerate() {
        System.out.print("successfully");
    }
}
