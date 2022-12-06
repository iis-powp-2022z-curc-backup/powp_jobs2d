package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import edu.kis.powp.command.factories.CommandFactory;
import edu.kis.powp.enums.TestFiguresEnum;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.features.DrawerFeature;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		DrawerFeature drawerFeature = new DrawerFeature();
		drawerFeature.getDrawerController().clearPanel();
		String name = e.getActionCommand();

		switch(TestFiguresEnum.getFromString(name)) {
			case TRAPEZE:
				CommandFactory.getCraftedTrapeze().execute(driverManager.getCurrentDriver());
				break;
			case TRIANGLE:
				CommandFactory.getCraftedTriangle().execute(driverManager.getCurrentDriver());
				break;
			case RECTANGLE:
				CommandFactory.getCraftedRectangle().execute(driverManager.getCurrentDriver());
				break;
			case CIRCLE:
				CommandFactory.getCraftedCircle().execute(driverManager.getCurrentDriver());
				break;
			case FIGURE_JOE_1:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case FIGURE_JOE_2:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			default:
				System.out.println("Test for " + name + " not found");
		}


	}
}
