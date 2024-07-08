package patterns.abstractFactory;

public class Rectangle implements Graphics, Paint{
    @Override
    public Button createButton() {
        if (Rectangle.class.toString().equals("Button")) return new Button();
        return null;
    }

    @Override
    public Rectangle createRect() {
        return new Rectangle();
    }

    @Override
    public void paint() {
        System.out.println("rect");
    }
}
