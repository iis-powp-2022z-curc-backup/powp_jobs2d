package edu.kis.powp.jobs2d.commands;
import edu.kis.powp.jobs2d.Job2dDriver;

public class FigureFactory {

    public static ComplexCommand createTriangle(int startX, int startY, int width, int height) {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(startX, startY));
        complexCommand.addCommand(new OperateToCommand(startX+width, startY));
        complexCommand.addCommand(new OperateToCommand((startX+width)/2, startY+height));
        complexCommand.addCommand(new OperateToCommand(startX, startY));
        return complexCommand;
    }

    public static ComplexCommand createRectangle(int startX, int startY, int width, int height) {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(startX, startY));
        complexCommand.addCommand(new OperateToCommand(startX+width, startY));
        complexCommand.addCommand(new OperateToCommand(startX+width, startY+height));
        complexCommand.addCommand(new OperateToCommand(startX, startY+height));
        complexCommand.addCommand(new OperateToCommand(startX, startY));
        return complexCommand;
    }

    public static ComplexCommand createHexagon(int startX, int startY, int sideLength) {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(startX, startY));
        complexCommand.addCommand(new OperateToCommand(startX+sideLength/2, startY));
        complexCommand.addCommand(new OperateToCommand(startX+sideLength, startY+sideLength/2));
        complexCommand.addCommand(new OperateToCommand(startX+sideLength/2, startY+sideLength));
        complexCommand.addCommand(new OperateToCommand(startX-sideLength/2, startY+sideLength));
        complexCommand.addCommand(new OperateToCommand(startX-sideLength, startY+sideLength/2));
        complexCommand.addCommand(new OperateToCommand(startX-sideLength/2, startY));
        complexCommand.addCommand(new OperateToCommand(startX, startY));
        return complexCommand;
    }
}
