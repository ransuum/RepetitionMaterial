package patterns.decorator;

public class BasicCar extends CarsDecorator {

    public BasicCar(Car car) {
        super(car);
    }

    public void start() {
        super.start();
        System.out.print(" Basic car");
    }
}
