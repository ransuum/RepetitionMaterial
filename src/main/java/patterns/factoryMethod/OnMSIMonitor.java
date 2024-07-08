package patterns.factoryMethod;

public class OnMSIMonitor extends On{
    @Override
    public Monitor factoryMethod() {
        return new MSI();
    }
}
