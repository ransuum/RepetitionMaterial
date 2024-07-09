package patterns.decorator;

public class CarsDecorator implements Car {

    protected Car car;

    public CarsDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void start() {
        this.car.start();
    }
}
