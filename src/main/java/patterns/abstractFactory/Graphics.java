package patterns.abstractFactory;

import java.awt.*;

public interface Graphics {
    Button createButton();
    Rectangle createRect();
}
