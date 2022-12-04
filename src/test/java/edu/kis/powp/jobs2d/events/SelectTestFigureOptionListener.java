package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.factories.DiamondFactory;
import edu.kis.powp.factories.StarFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;
import edu.kis.powp.jobs2d.utils.FigureTypes;

public class SelectTestFigureOptionListener implements ActionListener {
	private DriverManager driverManager;
	private FigureTypes figure;

	public SelectTestFigureOptionListener(DriverManager driverManager, FigureTypes figure) {
		this.driverManager = driverManager;
		this.figure = figure;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (figure) {
			case JOE_1:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;

			case JOE_2:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;

			case DIAMOND:
				DiamondFactory.getDiamondCommands().execute(driverManager.getCurrentDriver());
				break;

			case STAR:
				StarFactory.getStarCommands().execute(driverManager.getCurrentDriver());
				break;
		}
	}
}
