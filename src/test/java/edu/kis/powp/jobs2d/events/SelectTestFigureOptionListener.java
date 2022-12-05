package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.factory.FactoryInterface;
import edu.kis.powp.jobs2d.factory.RectangleFactory;
import edu.kis.powp.jobs2d.factory.SquareFactory;
import edu.kis.powp.jobs2d.factory.TriangleFactory;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Figure Joe 1")) {
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		}else if(e.getActionCommand().equals("Figure Joe 2")) {
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		}else if(e.getActionCommand().equals("Square")) {
			FactoryInterface factory = new SquareFactory();
			factory.create().execute(driverManager.getCurrentDriver());
		}else if(e.getActionCommand().equals("Triangle")) {
			FactoryInterface factory = new TriangleFactory();
			factory.create().execute(driverManager.getCurrentDriver());
		}else if(e.getActionCommand().equals("Rectangle")) {
			FactoryInterface factory = new RectangleFactory();
			factory.create().execute(driverManager.getCurrentDriver());
		}
		
		
	}
}
