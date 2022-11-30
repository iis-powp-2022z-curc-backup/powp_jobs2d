package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

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

			if(Objects.equals(e.getActionCommand(), "Figure Joe 1")) {
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
			} else {
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
			}

	}
}
