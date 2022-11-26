package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {
    private int x = 0;
    private int y = 0;

    private Job2dDriver driver = null;
    public OperateToCommand(Job2dDriver driver, int x, int y){
        this.x = x;
        this.y = y;
        this.driver = driver;
    }


    @Override
    public void execute() {
        driver.operateTo(x,y);
    }
}
