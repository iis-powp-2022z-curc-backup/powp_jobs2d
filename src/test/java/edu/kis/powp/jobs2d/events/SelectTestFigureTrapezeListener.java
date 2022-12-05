package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.factory.FigureTrapeze;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFigureTrapezeListener implements ActionListener {
    private DriverManager driverManager;

    public SelectTestFigureTrapezeListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        FigureTrapeze.getFigure().execute(driverManager.getCurrentDriver());
    }
}
