package patterns.factoryMethod;

public class BenQ implements Monitor {

    @Override
    public void on() {
        System.out.println("BenQ is on");
    }
}
