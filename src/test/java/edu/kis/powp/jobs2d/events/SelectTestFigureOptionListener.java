package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.FigureFactory;
import edu.kis.powp.jobs2d.features.DrawerFeature;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;



public class SelectTestFigureOptionListener implements ActionListener {
	private static final String FIGURE_JOE_1 = "Figure Joe 1";
	private static final String FIGURE_JOE_2 = "Figure Joe 2";
	private static final String RECTANGLE = "Rectangle";
	private static final String TRIANGLE = "Triangle";
	private static final String SQUARE = "Square";

	private final DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		DrawerFeature.getDrawerController().clearPanel();
		switch (e.getActionCommand()) {
			case FIGURE_JOE_1:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case FIGURE_JOE_2:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			case RECTANGLE:
				FigureFactory.getRectangle().execute(driverManager.getCurrentDriver());
				break;
			case TRIANGLE:
				FigureFactory.getTriangle().execute(driverManager.getCurrentDriver());
				break;
			case SQUARE:
				FigureFactory.getSquare().execute(driverManager.getCurrentDriver());
				break;
		}
	}

}
