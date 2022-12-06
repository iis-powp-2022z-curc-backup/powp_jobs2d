package edu.kis.powp.jobs2d.factory;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

import java.util.ArrayList;
import java.util.List;

public class CircleFactory implements FactoryInterface {

    @Override
    public DriverCommand create() {
        List<DriverCommand> commandList = new ArrayList<>();

        double edges = 20;
        int scale = 100;
        double step = (2 * Math.PI) / edges;

        commandList.add(new SetPositionCommand(0,scale));
        for(double i = 0; i < (2 * Math.PI); i += step){

            int x = (int)(Math.sin(i) * scale);
            int y = (int)(Math.cos(i) * scale);

            commandList.add(new OperateToCommand(x, y));
        }
        commandList.add(new OperateToCommand(0,scale));


        return new ComplexCommand(commandList);
    }
}
