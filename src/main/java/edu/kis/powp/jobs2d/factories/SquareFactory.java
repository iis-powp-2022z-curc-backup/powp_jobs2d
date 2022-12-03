package edu.kis.powp.jobs2d.factories;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

public class SquareFactory {
  public static DriverCommand square(Job2dDriver driver) {
    ComplexCommand complexCommand = new ComplexCommand();
    complexCommand.addCommand(new SetPositionCommand(-50, 50));
    complexCommand.addCommand(new OperateToCommand(50, 50));
    complexCommand.addCommand(new OperateToCommand(50, -50));
    complexCommand.addCommand(new OperateToCommand(-50, -50));
    complexCommand.addCommand(new OperateToCommand(-50, 50));

    return complexCommand;
  }
}
