package edu.kis.powp.jobs2d.command;

public class OperateToCommand implements DriverCommand{
    private int x;
    private int y;

    OperateToCommand(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public void execute(Jobs2dDriver jobs2dDriver) {
        jobs2dDriver.operateTo(x,y);
    }
}
