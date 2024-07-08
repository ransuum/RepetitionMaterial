package patterns.abstractFactory;

public class App {
    private Button b;
    private Rectangle r;

    public App(Graphics graphics){
        b = graphics.createButton();
        r = graphics.createRect();
    }
    public void draw(){
        r.paint();
    }
}
