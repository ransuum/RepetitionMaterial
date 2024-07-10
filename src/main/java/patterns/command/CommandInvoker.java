package patterns.command;

import java.util.ArrayList;
import java.util.List;

public class CommandInvoker {
    List<Command> commands = new ArrayList<>();

    public void executeCommand(Command command) {
        command.execute();
        commands.add(command);
    }

    public void showHistory() {
        System.out.println("Command History:");
        for (Command command : commands) {
            System.out.println(command.getClass().getSimpleName());
        }
    }
}
