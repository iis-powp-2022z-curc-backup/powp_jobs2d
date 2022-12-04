package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.commands.FigureFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.features.DrawerFeature;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTriangleOptionListener implements ActionListener {
    private DriverManager driverManager;

    public SelectTriangleOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }
    public void actionPerformed(ActionEvent e) {
        FigureFactory.createTriangle(0, 0, 60, 80).execute(driverManager.getCurrentDriver());
    }
}
