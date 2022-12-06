package edu.kis.powp.command.factories;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;

public class CommandFactory {


    public static DriverCommand getCraftedTrapeze() {
        ComplexCommand complexCommand = new ComplexCommand();

        complexCommand.addCommand(new SetPositionCommand(0, 0));
        complexCommand.addCommand(new OperateToCommand(200, 0));
        complexCommand.addCommand(new OperateToCommand(150, 100));
        complexCommand.addCommand(new OperateToCommand(50, 100));
        complexCommand.addCommand(new OperateToCommand(0, 0));

        return complexCommand;
    }

    public static DriverCommand getCraftedTriangle() {
        ComplexCommand complexCommand = new ComplexCommand();

        complexCommand.addCommand(new SetPositionCommand(0, 100));
        complexCommand.addCommand(new OperateToCommand(100, -100));
        complexCommand.addCommand(new OperateToCommand(-100, -100));
        complexCommand.addCommand(new OperateToCommand(0, 100));

        return complexCommand;
    }


    public static DriverCommand getCraftedRectangle() {
        ComplexCommand complexCommand = new ComplexCommand();

        complexCommand.addCommand(new SetPositionCommand(0, 0));
        complexCommand.addCommand(new OperateToCommand(200, 0));
        complexCommand.addCommand(new OperateToCommand(200, 100));
        complexCommand.addCommand(new OperateToCommand(0, 100));
        complexCommand.addCommand(new OperateToCommand(0, 0));

        return complexCommand;
    }

    public static DriverCommand getCraftedCircle() {
        ComplexCommand complexCommand = new ComplexCommand();
        final int RADIUS = 100;

        double i, angle, x1, y1;

        complexCommand.addCommand(new SetPositionCommand(RADIUS, 0));

        for(i = 0; i < 360; i++) {
            angle = i;
            x1 = RADIUS * Math.cos(angle * Math.PI /100);
            y1 = RADIUS * Math.sin(angle * Math.PI /100);

            complexCommand.addCommand(new OperateToCommand((int)x1, (int)y1));

        }

        return complexCommand;
    }
}
