package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DefaultDrawerFrame;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

/**
 * driver adapter to drawer with several bugs.
 */
public class DrawerToJobs2dMagicAdapter extends DrawPanelController implements Job2dDriver {
	private int startX = 0, startY = 0;

	public DrawerToJobs2dMagicAdapter() {
		super();
	}

	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

	@Override
	public void operateTo(int x, int y) {
		DrawPanelController controller = DrawerFeature.getDrawerController();
		DefaultDrawerFrame.getDefaultDrawerFrame().setVisible(true);
		ILine line = LineFactory.getBasicLine();
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);
		controller.drawLine(line);
		setPosition(x, y);
	}

	@Override
	public String toString() {
		return "DrawerToJobs2dMagicAdapter";
	}
}
