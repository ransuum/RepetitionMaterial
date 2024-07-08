package patterns.abstractFactory;

import java.awt.*;

public class Button implements Graphics{
    @Override
    public Button createButton() {
        return new Button();
    }

    @Override
    public Rectangle createRect() {
        if ("Rectangle".equals(Button.class.toString())) return new Rectangle();
        return null;
    }
}
