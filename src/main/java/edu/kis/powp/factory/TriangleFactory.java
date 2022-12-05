package edu.kis.powp.factory;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;

public class TriangleFactory {
	public static DriverCommand getTriangle() {
		ComplexCommand complexCommand = new ComplexCommand();
		complexCommand.addDriverCommand(new SetPositionCommand(0, 0));
		complexCommand.addDriverCommand(new OperateToCommand(0, 200));
		complexCommand.addDriverCommand(new OperateToCommand(0, 200));
		complexCommand.addDriverCommand(new OperateToCommand(0, 0));
		return complexCommand;
	}
}
