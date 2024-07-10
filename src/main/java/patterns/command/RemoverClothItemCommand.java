package patterns.command;

public class RemoverClothItemCommand implements Command {
    private Cloth cloth;
    private Order order;

    public RemoverClothItemCommand(Cloth cloth, Order order) {
        this.cloth = cloth;
        this.order = order;
    }

    @Override
    public void execute() {
        order.removeCloth(cloth);
        System.out.println("removed " + cloth);
    }
}
