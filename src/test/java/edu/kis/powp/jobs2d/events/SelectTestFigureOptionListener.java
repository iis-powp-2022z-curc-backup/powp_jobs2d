package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.factory.CommandFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.enums.TestFigureEnum;
import edu.kis.powp.jobs2d.features.DrawerFeature;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private final DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		DrawerFeature.getDrawerController().clearPanel();
		String testName = e.getActionCommand();
		try {
			switch (TestFigureEnum.fromString(testName)) {
				case FIGURE_JOE_1:
					FiguresJoe.figureScript1(driverManager.getCurrentDriver());
					break;
				case FIGURE_JOE_2:
					FiguresJoe.figureScript2(driverManager.getCurrentDriver());
					break;
				case FIGURE_RECTANGLE:
					CommandFactory.getDrawRectangleCommand().execute(driverManager.getCurrentDriver());
					break;
				case FIGURE_TRIANGLE:
					CommandFactory.getDrawTriangleCommand().execute(driverManager.getCurrentDriver());
					break;
				default:
					System.out.println("Test not yet implemented: " + testName);
			}
		} catch (IllegalArgumentException ex) {
			System.out.println("Test name not recognized: " + testName);
		}
	}
}
