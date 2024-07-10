package patterns.command;

public class AddClothItemCommand implements Command{
    private Cloth cloth;
    private Order order;

    public AddClothItemCommand(Cloth cloth, Order order) {
        this.cloth = cloth;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.addCloth(cloth) + "\n + added");
    }
}
