package edu.kis.powp.jobs2d.drivers.adapter;

import java.lang.Math;
import edu.kis.powp.jobs2d.features.DrawerFeature;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;

/**
 * driver adapter to drawer with several bugs.
 */
public class LineDrawerAdapter implements Job2dDriver {
	private int startX = 0, startY = 0, line_length = 50;

	public LineDrawerAdapter() {
		super();
	}

	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

	@Override
	public void operateTo(int x, int y) {
		ILine line = LineFactory.getBasicLine();
		int xDistance = x-this.startX;
		int yDistance = y-this.startY;
		double numberOfSteps = 12;
		boolean isInDrawingMode = false;
		
		for(int i =0; i<numberOfSteps; i++) {
			int newX = this.startX + (int)((i/numberOfSteps)*xDistance);
			int newY = this.startY + (int)((i/numberOfSteps)*yDistance);
			if(isInDrawingMode) {
				line.setEndCoordinates(newX, newY);
				DrawerFeature.getDrawerController().drawLine(line);
			}else {
				line.setStartCoordinates(newX, newY);
			}
			isInDrawingMode = !isInDrawingMode; 
		}
		setPosition(x,y);
		
	}

	@Override
	public String toString() {
		return "@Q!$!@$!#@$(*#@&Q(%^*#@";
	}
}
