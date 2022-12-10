package edu.kis.powp.jobs2d.factories;

import java.util.ArrayList;

import edu.kis.powp.jobs2d.commands.ComplexCommand;
import edu.kis.powp.jobs2d.commands.DriverCommand;
import edu.kis.powp.jobs2d.commands.OperateToCommand;
import edu.kis.powp.jobs2d.commands.SetPositionCommand;

public class DrawSquare implements FactoryManager{

	@Override
	public DriverCommand create() {
		ArrayList<DriverCommand> list = new ArrayList<>();
		list.add(new SetPositionCommand(-50, -50));
		list.add(new OperateToCommand(50, -50));
		list.add(new SetPositionCommand(50, -50));
		list.add(new OperateToCommand(50, 50));
		list.add(new SetPositionCommand(50, 50));
		list.add(new OperateToCommand(-50, 50));
		list.add(new SetPositionCommand(-50, 50));
		list.add(new OperateToCommand(-50, -50));

		ComplexCommand command = new ComplexCommand(list);

		return command;
	}

}