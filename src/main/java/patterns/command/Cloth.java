package patterns.command;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Cloth {
    private String email;
    private String color;
    private String size;
    private String name;
    private double price;

    public Cloth(String color, String size, String name,
                 double price, String email) {
        this.color = color;
        this.email = email;
        this.size = size;
        this.name = name;
        this.price = price;
    }
}
