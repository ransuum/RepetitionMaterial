package patterns.prototype;

import java.time.LocalDateTime;
import java.util.Objects;

public class Math extends Lessons{
    private String topic;

    public Math(){

    }

    public Math(Math tar){
        super(tar);
        if (tar != null){
            this.topic = tar.getTopic();
        }
    }
    @Override
    public Lessons clone() {
        return new Math(this);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), topic);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Math math) || !super.equals(o)) return false;
        return Objects.equals(math.getTopic(), topic);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
