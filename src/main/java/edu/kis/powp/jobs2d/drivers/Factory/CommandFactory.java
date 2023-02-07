package edu.kis.powp.jobs2d.drivers.Factory;

import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

import java.util.ArrayList;
import java.util.List;

public class CommandFactory {
    public static DriverCommand getDrawRectangleCommand() {
        List<DriverCommand> commands = new ArrayList<>();
        commands.add(new SetPositionCommand( -100, -50));
        commands.add(new OperateToCommand( 200, -50));
        commands.add(new OperateToCommand( 200, 100));
        commands.add(new OperateToCommand( -100, 100));
        commands.add(new OperateToCommand( -100, -50));
        return new ComplexCommand(commands);
    }

    public static DriverCommand getDrawTriangleCommand() {
        List<DriverCommand> commands = new ArrayList<>();
        commands.add(new SetPositionCommand(0, 100));
        commands.add(new OperateToCommand(100, -100));
        commands.add(new OperateToCommand(-100, -100));
        commands.add(new OperateToCommand(0, 100));
        return new ComplexCommand(commands);
    }
}