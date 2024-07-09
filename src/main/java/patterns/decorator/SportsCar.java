package patterns.decorator;

public class SportsCar extends CarsDecorator {

    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void start(){
        super.start();
        System.out.print(" Sports car");
    }
}
