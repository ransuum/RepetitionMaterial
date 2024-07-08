package patterns.prototype;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Lessons {
    private String name;
    private LocalDateTime localDateTime;

    public Lessons() {
    }

    public Lessons(Lessons tar) {
        if (tar != null) {
            this.name = tar.getName();
            this.localDateTime = tar.getLocalDateTime();
        }
    }

    public abstract Lessons clone();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Lessons lessons)) return false;
        return Objects.equals(lessons.getName(), name) && Objects.equals(lessons.getLocalDateTime(), localDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, localDateTime);
    }
}
