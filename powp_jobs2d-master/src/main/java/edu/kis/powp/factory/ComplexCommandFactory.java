package edu.kis.powp.factory;

import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.composite.ComplexCommand;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommandFactory{
    public static ComplexCommand getRectangle(){
        List<DriverCommand> commandList = new ArrayList<>();
        commandList.add(new SetPositionCommand(0,0));
        commandList.add(new OperateToCommand(100,0));
        commandList.add(new OperateToCommand(100,200));
        commandList.add(new OperateToCommand(0,200));
        commandList.add(new OperateToCommand(0,0));

        return new ComplexCommand(commandList);
    }

    public static ComplexCommand getIsoscelesTriangle(){
        List<DriverCommand> commandList = new ArrayList<>();
        commandList.add(new SetPositionCommand(0,0));
        commandList.add(new OperateToCommand(100,0));
        commandList.add(new OperateToCommand(50,200));
        commandList.add(new OperateToCommand(0,0));

        return new ComplexCommand(commandList);
    }

    public static ComplexCommand getSquare(){
        List<DriverCommand> commandList = new ArrayList<>();
        commandList.add(new SetPositionCommand(0,0));
        commandList.add(new OperateToCommand(100,0));
        commandList.add(new OperateToCommand(100,100));
        commandList.add(new OperateToCommand(0,100));
        commandList.add(new OperateToCommand(0,0));


        return new ComplexCommand(commandList);
    }
}


