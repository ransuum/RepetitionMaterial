package patterns.bridge;

public class BasicPc extends Pc{
    public BasicPc(Acceleration acceleration) {
        super(acceleration);
    }

    @Override
    public void accelerate() {
        System.out.print("Basic PC Accelerating: ");
        acceleration.accelerate();
    }
}
