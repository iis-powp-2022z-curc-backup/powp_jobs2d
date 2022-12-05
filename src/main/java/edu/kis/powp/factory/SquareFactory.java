package edu.kis.powp.factory;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;

public class SquareFactory {
	public static DriverCommand getSquare() {
		ComplexCommand complexCommand = new ComplexCommand();
		complexCommand.addDriverCommand(new SetPositionCommand(0, 0));
		complexCommand.addDriverCommand(new OperateToCommand(100, 0));
		complexCommand.addDriverCommand(new OperateToCommand(100, 100));
		complexCommand.addDriverCommand(new OperateToCommand(0, 100));
		complexCommand.addDriverCommand(new OperateToCommand(0, 0));
		return complexCommand;
	}
}
