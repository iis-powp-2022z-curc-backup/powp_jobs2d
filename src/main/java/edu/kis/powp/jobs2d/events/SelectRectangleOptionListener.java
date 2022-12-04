package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.commands.FigureFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.features.DrawerFeature;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectRectangleOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectRectangleOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    public void actionPerformed(ActionEvent e) {
        FigureFactory.createRectangle(0, 0, 40, 50).execute(driverManager.getCurrentDriver());
    }
}
