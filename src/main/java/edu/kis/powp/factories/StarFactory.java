package edu.kis.powp.factories;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;

import java.util.ArrayList;
import java.util.Arrays;

public class StarFactory {
    public static ComplexCommand getStarCommands() {
        return new ComplexCommand(new ArrayList<>(Arrays.asList(
                new SetPositionCommand(-80, -50),
                new OperateToCommand(-30, -50),
                new OperateToCommand(0, -100),
                new OperateToCommand(30, -50),
                new OperateToCommand(80, -50),
                new OperateToCommand(30, -20),
                new OperateToCommand(40, 40),
                new OperateToCommand(0, 0),
                new OperateToCommand(-40, 40),
                new OperateToCommand(-30, -20),
                new OperateToCommand(-80, -50)
            )));
    }
}
