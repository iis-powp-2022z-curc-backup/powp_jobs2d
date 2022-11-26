package edu.kis.powp.command;

import java.util.List;

public class ComplexCommand implements DriverCommand {
    private final List<DriverCommand> commands;

    public ComplexCommand(List<DriverCommand> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        if (commands == null) return;
        this.commands.forEach(DriverCommand::execute);
    }
}
