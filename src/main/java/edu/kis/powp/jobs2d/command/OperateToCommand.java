package edu.kis.powp.jobs2d.command;

public class OperateToCommand implements DriverCommand {
    int x = 0;
    int y = 0;

    public OperateToCommand(int x, int y){
        this.x = x;
        this.y = y;
    }


    @Override
    public void execute() {

    }
}
