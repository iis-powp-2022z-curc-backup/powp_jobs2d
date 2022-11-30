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
	private int startX = 0, startY = 0, line_length = 10;

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
		while(Math.abs(y -this.startY)<line_length && Math.abs(x -this.startX)<line_length ) {
			line.setStartCoordinates(this.startX, this.startY);
			line.setEndCoordinates(this.startX + xFactor, this.startY + yFactor);
			DrawerFeature.getDrawerController().drawLine(line);
			setPosition(this.startX + xFactor * 2, this.startY + yFactor * 2);
		}
		setPosition(x,y);
    
	}

	@Override
	public String toString() {
		return "@Q!$!@$!#@$(*#@&Q(%^*#@";
	}
}
