package edu.kis.powp.jobs2d.commands;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;

import static edu.kis.powp.jobs2d.features.DrawerFeature.getDrawerController;

public class OperateToCommand implements DriverCommand {

    private int x, y;

    public OperateToCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void execute(Job2dDriver driver) {
        driver.operateTo(this.x, this.y);
    }
}
