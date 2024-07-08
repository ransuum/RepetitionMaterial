package patterns.singleton;

public class Main {
    public static void main(String[] args) {
        Ukraine ukraine1 = Ukraine.getInstance("Kyiv");
        Ukraine ukraine2 = Ukraine.getInstance("Kharkiv");
        Ukraine ukraine3 = Ukraine.getInstance("Lviv");
        System.out.println(ukraine1.capital);
        System.out.println(ukraine2.capital);
        System.out.println(ukraine3.capital);
    }
}
