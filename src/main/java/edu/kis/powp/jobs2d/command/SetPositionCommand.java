package edu.kis.powp.jobs2d.command;

public class SetPositionCommand implements DriverCommand {

    int x = 0;
    int y = 0;

    public SetPositionCommand(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {

    }
}
