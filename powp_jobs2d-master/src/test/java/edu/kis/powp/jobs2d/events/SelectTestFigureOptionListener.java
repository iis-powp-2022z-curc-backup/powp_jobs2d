package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.factory.ComplexCommandFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;
import edu.kis.powp.jobs2d.features.DriverFeature;

public class SelectTestFigureOptionListener implements ActionListener {
	public static final String FIGURE_JOE_1 = "Figure Joe 1";
	public static final String FIGURE_JOE_2 = "Figure Joe 2";
	public static final String RECTANGLE = "Rectangle";
	public static final String Isosceles_Triangle = "Isosceles Triangle";
	public static final String Square = "Square";
	private final DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getActionCommand().equals(FIGURE_JOE_1))
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		else if(e.getActionCommand().equals(FIGURE_JOE_2)
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		else if(e.getActionCommand().equals(RECTANGLE))
			ComplexCommandFactory.getRectangle().execute(driverManager.getCurrentDriver());
		else if(e.getActionCommand().equals(Isosceles_Triangle))
			ComplexCommandFactory.getIsoscelesTriangle().execute(DriverFeature.getDriverManager().getCurrentDriver());
		else if(e.getActionCommand().equals(Square))
			ComplexCommandFactory.getSquare().execute(DriverFeature.getDriverManager().getCurrentDriver());
	}
}
