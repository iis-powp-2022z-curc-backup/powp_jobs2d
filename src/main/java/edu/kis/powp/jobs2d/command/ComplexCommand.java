package edu.kis.powp.jobs2d.command;


import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.List;

public class ComplexCommand implements DriverCommand{
    private List<DriverCommand> listComplexCommand;

    public ComplexCommand(List<DriverCommand> listComplexCommand){
        this.listComplexCommand=listComplexCommand;
    }

    @Override
    public void execute(Job2dDriver jobs2dDriver) {
        for (DriverCommand driverCommand : listComplexCommand) {
            driverCommand.execute(jobs2dDriver);
        }
    }
}
