package patterns.bridge;

public class Main {
    public static void main(String[] args) {
        Pc gamingPc = new GamingPc(new Successfully());
        gamingPc.accelerate();

        System.out.println();

        Pc basicPc = new BasicPc(new Explosion());
        basicPc.accelerate();

    }
}
