package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.LinkedList;
import java.util.List;

public class ComplexCommand implements DriverCommand {
    private final List<DriverCommand> commands;

    public ComplexCommand(List<DriverCommand> commands) {
        this.commands = commands;
    }

    @Override
    public void execute(Job2dDriver driver) {
        this.commands.forEach(command -> command.execute(driver));
    }
}