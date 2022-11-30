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
		int yFactor = (y-this.startY)/line_length;
		int xFactor = (x-this.startX)/line_length;
		boolean isInDrawingMode = true;
		while(true) {
			
			int newX = x, newY = y;
			if(Math.abs(y -this.startY)>(Math.abs(yFactor)*3) && Math.abs(x -this.startX)>(Math.abs(xFactor)*3)) {
				newX = this.startX +xFactor;
				newY = this.startY +yFactor;
			}else if(Math.abs(y -this.startY)<=(Math.abs(yFactor)*3) && Math.abs(x -this.startX)>(Math.abs(xFactor)*3)) {
				newX = this.startX +xFactor;
			}else if(Math.abs(y -this.startY)>(Math.abs(yFactor)*3) && Math.abs(x -this.startX)<=(Math.abs(xFactor)*3)) {
				newY = this.startY +yFactor;
			}else {
				break;
			}
			if (isInDrawingMode) {
				line.setStartCoordinates(this.startX, this.startY);
				line.setEndCoordinates(newX, newY);
				DrawerFeature.getDrawerController().drawLine(line);
			}
			
			setPosition(newX, newY);
			isInDrawingMode = !isInDrawingMode;
		}
		setPosition(x,y);
	
	}

	@Override
	public String toString() {
		return "@Q!$!@$!#@$(*#@&Q(%^*#@";
	}
}
