package edu.kis.powp.jobs2d.factories;

import java.util.ArrayList;
import edu.kis.powp.jobs2d.commands.ComplexCommand;
import edu.kis.powp.jobs2d.commands.DriverCommand;
import edu.kis.powp.jobs2d.commands.OperateToCommand;
import edu.kis.powp.jobs2d.commands.SetPositionCommand;

public class DrawRectangle implements FactoryManager{

	@Override
	public DriverCommand create() {
		ArrayList<DriverCommand> list = new ArrayList<>();
		list.add(new SetPositionCommand(-100, -200)); // Point 1
		list.add(new OperateToCommand(100, -200)); //Draw line to Point 2
		list.add(new SetPositionCommand(100, -200)); //  Point 2
		list.add(new OperateToCommand(100, 200)); //Draw line to Point 3
		list.add(new SetPositionCommand(100, 200)); // Point 3
		list.add(new OperateToCommand(-100, 200)); // Draw line to Point 4
		list.add(new SetPositionCommand(-100, 200)); // Point 4
		list.add(new OperateToCommand(-100, -200)); //Draw line to Point 1

		ComplexCommand command = new ComplexCommand(list);
		return command;
	}
}