package patterns.factoryMethod;

public class Main {
    public static void main(String[] args) {
        On on = new OnBenQMonitor();
        Monitor monitor = on.factoryMethod();
        monitor.on();

        On on1 = new OnMSIMonitor();
        monitor = on1.factoryMethod();
        monitor.on();
    }
}
