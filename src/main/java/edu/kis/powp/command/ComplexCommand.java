package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.LinkedList;
import java.util.List;

public class ComplexCommand implements DriverCommand {
    private List<DriverCommand> commandList = new LinkedList<>();

    public void addCommand(DriverCommand driverCommand) {

        this.commandList.add(driverCommand);
    }

    @Override
    public void execute(Job2dDriver driver) {

        commandList.forEach(driverCommand -> driverCommand.execute(driver));
    }
}
