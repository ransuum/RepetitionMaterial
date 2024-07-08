package patterns.prototype;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Lessons> lessons = new ArrayList<>();
        List<Lessons> copyLessons = new ArrayList<>();

        Math math = new Math();
        math.setTopic("123");
        math.setName("math");
        math.setLocalDateTime(LocalDateTime.of(2024, 8, 8, 14, 55));
        lessons.add(math);

        copyLessons.add(math.clone());

        Physics physics = new Physics();
        physics.setName("physics");
        physics.setLocalDateTime(LocalDateTime.of(2025, 8, 8, 14, 55));
        physics.setTopic("F");
        lessons.add(physics);

        copyLessons.add(physics.clone());

        compare(lessons, copyLessons);
    }

    private static void compare(List<Lessons> lessons, List<Lessons> lessonsCopy) {
        for (int i = 0; i < lessons.size(); i++) {
            if (lessons.get(i) != lessonsCopy.get(i)) {
                System.out.println(i + ": different objects");
                if (lessons.get(i).equals(lessonsCopy.get(i))) {
                    System.out.println(i + ": identical");
                } else {
                    System.out.println(i + ": not identical");
                }
            } else {
                System.out.println(i + ": the same");
            }
        }
    }
}
