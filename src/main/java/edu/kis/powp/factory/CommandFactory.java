package edu.kis.powp.factory;
import java.util.ArrayList;
import java.util.List;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.command.ComplexCommand;
public class CommandFactory {
    public static DriverCommand getDrawRectangle() {
        List<DriverCommand> commands = new ArrayList<>();
        commands.add(new SetPositionCommand(0, 0));
        commands.add(new OperateToCommand(150, 0));
        commands.add(new OperateToCommand(150, 100));
        commands.add(new OperateToCommand(0, 100));
        commands.add(new OperateToCommand(0, 0));
        return new ComplexCommand(commands);
    }
    public static DriverCommand getDrawTriangle() {
        List<DriverCommand> commands = new ArrayList<>();
        commands.add(new SetPositionCommand(0, 50));
        commands.add(new OperateToCommand(50, -50));
        commands.add(new OperateToCommand(-50, -50));
        commands.add(new OperateToCommand(-0, 50));
        return new ComplexCommand(commands);
    }
}
