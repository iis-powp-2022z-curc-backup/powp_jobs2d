package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.commands.FigureFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.features.DrawerFeature;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectHexagonOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectHexagonOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    public void actionPerformed(ActionEvent e) {
        FigureFactory.createHexagon(0, 0, 80).execute(driverManager.getCurrentDriver());
    }

}
