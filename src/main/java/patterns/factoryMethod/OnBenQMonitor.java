package patterns.factoryMethod;

public class OnBenQMonitor extends On{
    @Override
    public Monitor factoryMethod() {
        return new BenQ();
    }
}
