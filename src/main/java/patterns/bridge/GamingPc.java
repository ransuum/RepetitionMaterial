package patterns.bridge;

public class GamingPc extends Pc {
    public GamingPc(Acceleration acceleration) {
        super(acceleration);
    }

    @Override
    public void accelerate() {
        System.out.print("Gaming Acceleration: ");
        acceleration.accelerate();
    }
}
