package patterns.abstractFactory;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Graphics graphics;
        App app;
        String ans = "b";
        if (ans.equals("b")){
            graphics = new Button();
        } else {
            graphics = new Rectangle();
        }
        app = new App(graphics);
        app.draw();
    }
}
