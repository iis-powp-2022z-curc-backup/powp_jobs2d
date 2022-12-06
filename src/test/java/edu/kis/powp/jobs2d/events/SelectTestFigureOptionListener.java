package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.factory.CircleFactory;
import edu.kis.powp.jobs2d.factory.FactoryInterface;
import edu.kis.powp.jobs2d.factory.TriangleFactory;
import edu.kis.powp.jobs2d.features.DrawerFeature;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		DrawerFeature.getDrawerController().clearPanel();

		switch (e.getActionCommand()){
			case "Figure Joe 1":
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;

			case "Figure Joe 2":
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;

			case "Triangle":
				FactoryInterface triangle = new TriangleFactory();
				triangle.create().execute(driverManager.getCurrentDriver());
				break;

			case "Circle":
				FactoryInterface circle = new CircleFactory();
				circle.create().execute(driverManager.getCurrentDriver());
				break;
		}
	}
}
