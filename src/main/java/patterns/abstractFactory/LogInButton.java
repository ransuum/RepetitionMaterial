package patterns.abstractFactory;

public class LogInButton implements Button{

    @Override
    public void click() {
        System.out.println("CLICKED");
    }
}
