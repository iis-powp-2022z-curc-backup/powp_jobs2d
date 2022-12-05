package edu.kis.powp.jobs2d.factory;

import java.util.ArrayList;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

public class RectangleFactory implements FactoryInterface{

	@Override
	public DriverCommand create() {
		ArrayList<DriverCommand> list = new ArrayList<>();
		list.add(new SetPositionCommand(-50, -100));
		list.add(new OperateToCommand(50, -100));
		list.add(new SetPositionCommand(50, -100));
		list.add(new OperateToCommand(50, 100));
		list.add(new SetPositionCommand(50, 100));
		list.add(new OperateToCommand(-50, 100));
		list.add(new SetPositionCommand(-50, 100));
		list.add(new OperateToCommand(-50, -100));
		
		ComplexCommand command = new ComplexCommand(list);
		
		return command;
	}

}
