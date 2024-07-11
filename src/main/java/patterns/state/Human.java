package patterns.state;

public class Human {
    private HealthState h;

    public Human() {
        this.h = new HealthyState();
    }

    public HealthState getH() {
        return h;
    }

    public void setH(HealthState h) {
        this.h = h;
    }

    public void exercise(){
        h.exercise(this);
    }

    public void sleep(){
        h.sleep(this);
    }

    public void takeMedicine(){
        h.takeMedicine(this);
    }
}
