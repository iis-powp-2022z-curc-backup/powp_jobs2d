package edu.kis.powp.command;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {
    private final ArrayList<DriverCommand> commands;

    public ComplexCommand(ArrayList<DriverCommand> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        if (commands == null) return;
        this.commands.forEach(DriverCommand::execute);
    }
}
