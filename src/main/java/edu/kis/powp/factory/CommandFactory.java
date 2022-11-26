package edu.kis.powp.factory;

import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class CommandFactory {
    public List<DriverCommand> getCommand(Job2dDriver driver, String command) {
        List<DriverCommand> commands = new ArrayList<DriverCommand>();
        switch(command) {
            case "rectangle":
                commands.add(new SetPositionCommand(driver, 0, 0));
                commands.add(new OperateToCommand(driver, 0, 0));
                return commands;

            case "circle":
                commands.add(new SetPositionCommand(driver, 0, 0));
                return commands;

            default:
                return new ArrayList<>();
        }
    }
}
