package patterns.command;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Order {
    private List<Cloth> clothsOrder = new ArrayList<>();

    public Cloth addCloth(Cloth cloth) {
        clothsOrder.add(cloth);
        return cloth;
    }

    public void removeCloth(Cloth cloth) {
        clothsOrder.remove(cloth);
    }

    public Cloth updateCloth(String name, String email, String size,
                             String color, double price) {
        Cloth cloth1 = new Cloth();

        for (Cloth cloth : clothsOrder) {
            if (cloth.getEmail().equals(email)) {
                if (!name.trim().isEmpty()) cloth.setName(name);
                if (!size.trim().isEmpty()) cloth.setSize(size);
                if (!color.trim().isEmpty()) cloth.setColor(color);
                if (price > 0) cloth.setPrice(price);
            }
            cloth1 = cloth;
        }
        return cloth1;
    }

    public List<Cloth> showOrder(String email) {
        return this.clothsOrder.stream().filter(cloth ->
                cloth.getEmail().equals(email)).toList();
    }
}
