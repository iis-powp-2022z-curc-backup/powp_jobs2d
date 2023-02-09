package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;
import edu.kis.powp.jobs2d.features.DrawerFeature;

import edu.kis.powp.jobs2d.factories.FactoryManager;
import edu.kis.powp.jobs2d.factories.DrawSquare;
import edu.kis.powp.jobs2d.factories.DrawRectangle;




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
				DrawerFeature.getDrawerController().clearPanel();
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case "Figure Joe 2":
				DrawerFeature.getDrawerController().clearPanel();
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			case "Square":
				DrawerFeature.getDrawerController().clearPanel();
				FactoryManager factory1 = new DrawSquare();
				factory1.create().execute(driverManager.getCurrentDriver());
				break;
			case "Rectangle":
				DrawerFeature.getDrawerController().clearPanel();
				FactoryManager factory2 = new DrawRectangle();
				factory2.create().execute(driverManager.getCurrentDriver());
				break;
		}
	}
}
