package edu.kis.powp.jobs2d.factories;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

public class TriangleFactory {
  public static DriverCommand triangle(Job2dDriver driver) {
    ComplexCommand complexCommand = new ComplexCommand();
    complexCommand.addCommand(new SetPositionCommand(-100, 0));
    complexCommand.addCommand(new OperateToCommand(0, -100));
    complexCommand.addCommand(new OperateToCommand(100, 0));
    complexCommand.addCommand(new OperateToCommand(-100, 0));

    return complexCommand;
  }
}
