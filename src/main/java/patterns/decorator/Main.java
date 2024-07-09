package patterns.decorator;

public class Main {
    public static void main(String[] args) {
        Car basicCar = new BasicCar(new CarEngine());
        basicCar.start();

        System.out.println();

        Car sportCar = new SportsCar(new CarEngine());
        sportCar.start();
    }
}
