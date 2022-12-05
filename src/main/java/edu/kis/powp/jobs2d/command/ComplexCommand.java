package edu.kis.powp.jobs2d.command;


import java.util.List;

public class ComplexCommand implements DriverCommand{
    private List<DriverCommand> listComplexCommand;

    ComplexCommand(List<DriverCommand> listComplexCommand){
        this.listComplexCommand=listComplexCommand;
    }

    @Override
    public void execute(Jobs2dDriver jobs2dDriver) {
        for (DriverCommand driverCommand : listComplexCommand) {
            driverCommand.execute(jobs2dDriver);
        }
    }
}
