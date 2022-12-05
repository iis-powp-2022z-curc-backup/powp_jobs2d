package edu.kis.powp.jobs2d.factory;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

import java.util.Arrays;
import java.util.List;

public class FigureRectangle {
    private static List<DriverCommand> listRectangle = (Arrays.asList(
            new SetPositionCommand(0,0),
            new OperateToCommand(0,-50),
            new OperateToCommand(-150,-50),
            new OperateToCommand(-150,0),
            new OperateToCommand(0,0)));


    public static ComplexCommand getFigure(){
        ComplexCommand complexCommand = new ComplexCommand(listRectangle);
        return complexCommand;
    }
}
