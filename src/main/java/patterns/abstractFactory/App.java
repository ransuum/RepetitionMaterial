package patterns.abstractFactory;

public class App {
    private Button button;

    public App(Login login){
        button = login.create();
    }

    public void click(){
        button.click();
    }
}
