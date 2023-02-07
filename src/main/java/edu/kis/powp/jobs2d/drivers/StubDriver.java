
package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class StubDriver implements Job2dDriver {
    private final List<DriverCommand> commands = new ArrayList<>();

    @Override
    public void setPosition(int x, int y) {
        commands.add(new SetPositionCommand(x, y));
    }

    @Override
    public void operateTo(int x, int y) {
        commands.add(new OperateToCommand(x, y));
    }

    public List<DriverCommand> getCommands() {
        return commands;
    }
}