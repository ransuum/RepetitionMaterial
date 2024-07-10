package patterns.command;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        CommandInvoker commandInvoker = new CommandInvoker();

        Cloth cloth1 = new Cloth("Black", "XL", "John", 650d, "test@gmail.com");

        Command command = new AddClothItemCommand(cloth1, order);
        Command command1 = new FindByEmailCommand(order, "test@gmail.com");
        Command command2 = new RemoverClothItemCommand(cloth1, order);

        commandInvoker.executeCommand(command);
        commandInvoker.executeCommand(command1);
        commandInvoker.executeCommand(command2);
        System.out.println(order.getClothsOrder());
    }
}
