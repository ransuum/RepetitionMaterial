package patterns.decorator;

public class CarEngine implements Car{
    @Override
    public void start() {
        System.out.print("Car Engine start...");
    }
}
