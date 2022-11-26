package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {
    List<DriverCommand> commandList = new ArrayList<>();

    public void addCommand(DriverCommand command) {
        this.commandList.add(command);
    }

    @Override
    public void execute(Job2dDriver driver) {
        for (DriverCommand command : this.commandList) {
            command.execute(driver);
        }
    }
}
