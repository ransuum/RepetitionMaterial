package patterns.interpreter;

public class Main {
    public static void main(String[] args) {
        Expression uah = new Number(40.49);
        Expression toUsd = new UahToUsd(uah);

        double res = toUsd.interpreter();
        System.out.println(res);
    }
}
