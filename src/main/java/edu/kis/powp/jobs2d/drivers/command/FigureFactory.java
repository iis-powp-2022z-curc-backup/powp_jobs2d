package edu.kis.powp.jobs2d.drivers.command;

import java.util.ArrayList;
import java.util.List;

public class FigureFactory {
    private static class Rectangle {
        private static final int x1 = -100;
        private static final int y1 = -100;

        private static final int x2 = -100;
        private static final int y2 = 100;

        private static final int x3 = 200;
        private static final int y3 = 100;

        private static final int x4 = 200;
        private static final int y4 = -100;

        public static List<DriverCommand> getCommandList() {
            List<DriverCommand> commandList = new ArrayList<>();
            commandList.add(new SetPositionCommand(x1, y1));
            commandList.add(new OperateToCommand(x1, y1));
            commandList.add(new OperateToCommand(x2, y2));
            commandList.add(new OperateToCommand(x3, y3));
            commandList.add(new OperateToCommand(x4, y4));
            commandList.add(new OperateToCommand(x1, y1));
            return commandList;
        }
    }

    private static class Triangle {
        public static final int x1 = -100;
        public static final int y1 = -100;

        public static final int x2 = 0;
        public static final int y2 = 0;

        public static final int x3 = 100;
        public static final int y3 = -100;


        public static List<DriverCommand> getCommandList() {
            List<DriverCommand> commandList = new ArrayList<>();
            commandList.add(new SetPositionCommand(x1, y1));
            commandList.add(new OperateToCommand(x1, y1));
            commandList.add(new OperateToCommand(x2, y2));
            commandList.add(new OperateToCommand(x3, y3));
            commandList.add(new OperateToCommand(x1, y1));
            return commandList;
        }
    }

    private static class Square {
        private static final int x1 = -100;
        private static final int y1 = -100;

        private static final int x2 = -100;
        private static final int y2 = 100;

        private static final int x3 = 100;
        private static final int y3 = 100;

        private static final int x4 = 100;
        private static final int y4 = -100;

        public static List<DriverCommand> getCommandList() {
            List<DriverCommand> commandList = new ArrayList<>();
            commandList.add(new SetPositionCommand(x1, y1));
            commandList.add(new OperateToCommand(x1, y1));
            commandList.add(new OperateToCommand(x2, y2));
            commandList.add(new OperateToCommand(x3, y3));
            commandList.add(new OperateToCommand(x4, y4));
            commandList.add(new OperateToCommand(x1, y1));
            return commandList;
        }
    }

    public static DriverCommand getRectangle() {
        return new ComplexCommand(Rectangle.getCommandList());
    }

    public static DriverCommand getTriangle() {
        return new ComplexCommand(Triangle.getCommandList());
    }

    public static DriverCommand getSquare() {
        return new ComplexCommand(Square.getCommandList());
    }
}

