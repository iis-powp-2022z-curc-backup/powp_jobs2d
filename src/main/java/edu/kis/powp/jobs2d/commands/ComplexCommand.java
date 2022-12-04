package edu.kis.powp.jobs2d.commands;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand{

    private List<DriverCommand> commandsList;

    public ComplexCommand() {
        this.commandsList = new ArrayList<>();
    }

    public ComplexCommand(List<DriverCommand> existingCommandsList) {
        this.commandsList = new ArrayList<>(existingCommandsList);
    }

    public void addCommand(DriverCommand newCommandToAdd) {
        this.commandsList.add(newCommandToAdd);
    }

    public void addCommands(List<DriverCommand> existingCommandsList) {
        this.commandsList.addAll(existingCommandsList);
    }

    @Override
    public void execute(Job2dDriver driver) {
        for(DriverCommand command: commandsList) {
            command.execute(driver);
        }
    }
}
