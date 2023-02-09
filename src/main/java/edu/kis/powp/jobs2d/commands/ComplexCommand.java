package edu.kis.powp.jobs2d.commands;

import edu.kis.powp.jobs2d.Job2dDriver;
import java.util.List;

public class ComplexCommand implements DriverCommand{
    private List<DriverCommand> List;

    public ComplexCommand(List<DriverCommand> newList){
        this.List = newList;
    }

    public void setNewList(List<DriverCommand> newList){
        this.List = newList;
    }

    @Override
    public void execute(Job2dDriver driver) {
        for (DriverCommand command : this.List) {
            command.execute(driver);
        }
    }
}