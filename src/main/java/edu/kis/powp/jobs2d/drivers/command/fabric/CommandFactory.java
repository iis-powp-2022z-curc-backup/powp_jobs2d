package edu.kis.powp.jobs2d.drivers.command.fabric;

import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

public class CommandFactory {
    public static DriverCommand getRectangle() {
        final ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(0, 0));
        complexCommand.addCommand(new OperateToCommand(200, 0));
        complexCommand.addCommand(new OperateToCommand(200, 100));
        complexCommand.addCommand(new OperateToCommand(0, 100));
        complexCommand.addCommand(new OperateToCommand(0, 0));
        return complexCommand;
    }

    public static DriverCommand getTrapeze() {
        final ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(0, 0));
        complexCommand.addCommand(new OperateToCommand(200, 0));
        complexCommand.addCommand(new OperateToCommand(150, 100));
        complexCommand.addCommand(new OperateToCommand(50, 100));
        complexCommand.addCommand(new OperateToCommand(0, 0));
        return complexCommand;
    }

}
