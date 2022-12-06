package edu.kis.powp.command;

public class SetPositionCommand implements DriverCommand {
    private int x, y = 0;

    public SetPositionCommand(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {}
}
