package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.List;

public class ComplexCommand implements DriverCommand {
    private List<DriverCommand> commandList;

    ComplexCommand(List<DriverCommand> commandList){
        this.commandList = commandList;
    }


    @Override
    public void execute(Job2dDriver driver) {
        this.commandList.forEach(driverCommand -> driverCommand.execute(driver));
    }
}
