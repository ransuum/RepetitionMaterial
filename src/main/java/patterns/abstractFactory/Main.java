package patterns.abstractFactory;

public class Main {
    public static void main(String[] args) {
        Login login = new Steam();
        App app = new App(login);
        app.click();
    }
}
