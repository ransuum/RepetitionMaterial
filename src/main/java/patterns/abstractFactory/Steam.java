package patterns.abstractFactory;

public class Steam implements Login{
    @Override
    public Button create() {
        return new LogInButton();
    }
}
