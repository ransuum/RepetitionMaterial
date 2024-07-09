package patterns.bridge;

public abstract class Pc {
    protected Acceleration acceleration;

    public Pc(Acceleration acceleration) {
        this.acceleration = acceleration;
    }

    public abstract void accelerate();
}
