package patterns.state;

public interface HealthState {
    void exercise(Human human);
    void takeMedicine(Human human);
    void sleep(Human human);
}
