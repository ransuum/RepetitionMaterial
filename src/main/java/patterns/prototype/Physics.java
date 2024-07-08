package patterns.prototype;

import java.util.Objects;

public class Physics extends Lessons {
    private String topic;

    public Physics(){

    }

    public Physics(Physics tar){
        super(tar);
        if (tar != null){
            this.topic = tar.getTopic();
        }
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public Lessons clone() {
        return new Physics(this);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Physics physics) || !super.equals(o)) return false;
        return Objects.equals(physics.getTopic(), topic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), topic);
    }
}
