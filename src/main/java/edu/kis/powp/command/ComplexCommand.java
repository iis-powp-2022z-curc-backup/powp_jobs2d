package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.List;

public class ComplexCommand implements DriverCommand{
    private List<DriverCommand> CommandList;

    public ComplexCommand(List<DriverCommand> CommandList){
        this.CommandList = CommandList;
    }

    @Override
    public void execute(Job2dDriver job2dDriver) {
        this.CommandList.forEach(driverCommand -> driverCommand.execute(job2dDriver));
    }
}
