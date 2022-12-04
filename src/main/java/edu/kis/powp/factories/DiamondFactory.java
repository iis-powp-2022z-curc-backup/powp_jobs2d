package edu.kis.powp.factories;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;

import java.util.ArrayList;
import java.util.Arrays;

public class DiamondFactory {
    public static ComplexCommand getDiamondCommands() {
        return new ComplexCommand(new ArrayList<>(Arrays.asList(
                new SetPositionCommand(-100, 0),
                new OperateToCommand(0, -100),
                new OperateToCommand(100, 0),
                new OperateToCommand(0, 100),
                new OperateToCommand(-100, 0)
        )));
    }
}
