package edu.kis.powp.jobs2d.commands;

import edu.kis.powp.jobs2d.Job2dDriver;

import static edu.kis.powp.jobs2d.features.DrawerFeature.getDrawerController;

public interface DriverCommand {
    void execute(Job2dDriver driver);
}
