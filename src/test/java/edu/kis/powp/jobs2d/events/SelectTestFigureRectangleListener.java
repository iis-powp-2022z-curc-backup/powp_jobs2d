package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.factory.FigureRectangle;
import edu.kis.powp.jobs2d.drivers.DriverManager;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFigureRectangleListener implements ActionListener {

    private DriverManager driverManager;

    public SelectTestFigureRectangleListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        FigureRectangle.getFigure().execute(driverManager.getCurrentDriver());
    }
}

