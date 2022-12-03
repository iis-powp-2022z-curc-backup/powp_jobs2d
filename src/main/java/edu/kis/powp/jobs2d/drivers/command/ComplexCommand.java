package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {

    private final List<DriverCommand> listOfCommands;

    public ComplexCommand() {
        this.listOfCommands = new ArrayList<>();
    }

    public void addCommand(DriverCommand command) {
        listOfCommands.add(command);
    }

    @Override
    public void execute(Job2dDriver job2dDriver) {
        for (DriverCommand command : listOfCommands) {
            command.execute(job2dDriver);
        }
    }
}
