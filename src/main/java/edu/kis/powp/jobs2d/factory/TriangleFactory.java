package edu.kis.powp.jobs2d.factory;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

import java.util.ArrayList;
import java.util.List;

public class TriangleFactory implements FactoryInterface{

    @Override
    public DriverCommand create() {
        List<DriverCommand> commandList = new ArrayList<>();

        commandList.add(new SetPositionCommand(-50,50));
        commandList.add(new OperateToCommand(50,50));
        commandList.add(new OperateToCommand(0,-50));
        commandList.add(new OperateToCommand(-50, 50));

        return new ComplexCommand(commandList);
    }
}
