package edu.kis.powp.jobs2d.command;

public class SetPositionCommand implements DriverCommand{
    private int x;
    private int y;

    SetPositionCommand(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public void execute(Jobs2dDriver jobs2dDriver) {
        jobs2dDriver.set_Position(x,y);
    }
}
