package edu.kis.powp.jobs2d.command.factory;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

public class FigureFactory {
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
