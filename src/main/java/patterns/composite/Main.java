package patterns.composite;

public class Main {
    public static void main(String[] args) {
        double s = 25d;
        Speed s1 = new FirstRunner();
        Speed s2 = new SecondRunner();

        Run run = new Run();
        run.add(s1);
        run.add(s2);

        run.speed(s--);

        run.deleteBySpeed(s1);
        System.out.println(run.getSpeeds());
    }
}
