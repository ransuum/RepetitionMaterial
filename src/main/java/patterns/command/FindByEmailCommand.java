package patterns.command;

public class FindByEmailCommand implements Command {
    private Order order;
    private String email;

    public FindByEmailCommand(Order order, String email) {
        this.order = order;
        this.email = email;
    }

    @Override
    public void execute() {
        System.out.println(order.showOrder(email));
    }
}
