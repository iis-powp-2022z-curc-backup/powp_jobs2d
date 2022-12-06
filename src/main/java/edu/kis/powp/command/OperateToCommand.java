package edu.kis.powp.command;

public class OperateToCommand implements DriverCommand {
    private int x, y = 0;

    public OperateToCommand(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {}
}
