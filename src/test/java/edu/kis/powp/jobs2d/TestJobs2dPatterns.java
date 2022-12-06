package edu.kis.powp.jobs2d;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.kis.legacy.drawer.panel.DefaultDrawerFrame;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.drivers.adapter.DrawerToJobs2dMagicAdapter;
import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapter;
import edu.kis.powp.jobs2d.enums.TestFigureEnum;
import edu.kis.powp.jobs2d.events.SelectChangeVisibleOptionListener;
import edu.kis.powp.jobs2d.events.SelectTestFigureOptionListener;
import edu.kis.powp.jobs2d.features.DrawerFeature;
import edu.kis.powp.jobs2d.features.DriverFeature;
import edu.kis.powp.jobs2d.shape.CustomLine;

public class TestJobs2dPatterns {
	private final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	/**
	 * Setup test concerning preset figures in context.
	 * 
	 * @param application Application context.
	 */
	private static void setupPresetTests(Application application) {
		SelectTestFigureOptionListener selectTestFigureOptionListener = new SelectTestFigureOptionListener(
				DriverFeature.getDriverManager());

		application.addTest(TestFigureEnum.FIGURE_JOE_1.toString(), selectTestFigureOptionListener);
		application.addTest(TestFigureEnum.FIGURE_JOE_2.toString(), selectTestFigureOptionListener);
		application.addTest(TestFigureEnum.FIGURE_RECTANGLE.toString(), selectTestFigureOptionListener);
		application.addTest(TestFigureEnum.FIGURE_TRIANGLE.toString(), selectTestFigureOptionListener);
		application.addTest(TestFigureEnum.FIGURE_JOE_1_WITH_COMPLEX_COMMAND.toString(), selectTestFigureOptionListener);
		application.addTest(TestFigureEnum.FIGURE_JOE_2_WITH_COMPLEX_COMMAND.toString(), selectTestFigureOptionListener);
		application.addTest(TestFigureEnum.MIX_OF_FIGURES_WITH_COMPLEX_COMMAND.toString(), selectTestFigureOptionListener);
	}

	/**
	 * Setup driver manager, and set default driver for application.
	 * 
	 * @param application Application context.
	 */
	private static void setupDrivers(Application application) {
		Job2dDriver loggerDriver = new LoggerDriver();
		DriverFeature.addDriver("Logger Driver", loggerDriver);
		DriverFeature.getDriverManager().setCurrentDriver(loggerDriver);

		DrawPanelController drawPanelController = DrawerFeature.getDrawerController();
		Job2dDriver testDriver = new DrawerToJobs2dMagicAdapter(drawPanelController);
		DriverFeature.addDriver("Buggy Simulator", testDriver);

		Job2dDriver basicLineDrawerDriver = new LineDrawerAdapter(drawPanelController, LineFactory.getBasicLine());
		DriverFeature.addDriver("Line Drawer Simulator – basic line", basicLineDrawerDriver);

		Job2dDriver dottedLineDrawerDriver = new LineDrawerAdapter(drawPanelController, LineFactory.getDottedLine());
		DriverFeature.addDriver("Line Drawer Simulator – dotted line", dottedLineDrawerDriver);

		Job2dDriver specialLineDrawerDriver = new LineDrawerAdapter(drawPanelController, LineFactory.getSpecialLine());
		DriverFeature.addDriver("Line Drawer Simulator – special line", specialLineDrawerDriver);

		Job2dDriver customLineDrawerDriver = new LineDrawerAdapter(drawPanelController, new CustomLine(Color.GREEN, 0.5f, true));
		DriverFeature.addDriver("Line Drawer Simulator – custom line", customLineDrawerDriver);

		DriverFeature.updateDriverInfo();
	}

	/**
	 * Auxiliary routines to enable using Buggy Simulator.
	 * 
	 * @param application Application context.
	 */
	private static void setupDefaultDrawerVisibilityManagement(Application application) {
		DefaultDrawerFrame defaultDrawerWindow = DefaultDrawerFrame.getDefaultDrawerFrame();
		application.addComponentMenuElementWithCheckBox(DrawPanelController.class, "Default Drawer Visibility",
				new SelectChangeVisibleOptionListener(defaultDrawerWindow), false);
		defaultDrawerWindow.setVisible(false);
	}

	/**
	 * Setup menu for adjusting logging settings.
	 * 
	 * @param application Application context.
	 */
	private static void setupLogger(Application application) {
		application.addComponentMenu(Logger.class, "Logger", 0);
		application.addComponentMenuElement(Logger.class, "Clear log",
				(ActionEvent e) -> application.flushLoggerOutput());
		application.addComponentMenuElement(Logger.class, "Fine level", (ActionEvent e) -> logger.setLevel(Level.FINE));
		application.addComponentMenuElement(Logger.class, "Info level", (ActionEvent e) -> logger.setLevel(Level.INFO));
		application.addComponentMenuElement(Logger.class, "Warning level",
				(ActionEvent e) -> logger.setLevel(Level.WARNING));
		application.addComponentMenuElement(Logger.class, "Severe level",
				(ActionEvent e) -> logger.setLevel(Level.SEVERE));
		application.addComponentMenuElement(Logger.class, "OFF logging", (ActionEvent e) -> logger.setLevel(Level.OFF));
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Application app = new Application("2d jobs Visio");
				DrawerFeature.setupDrawerPlugin(app);
				setupDefaultDrawerVisibilityManagement(app);

				DriverFeature.setupDriverPlugin(app);
				setupDrivers(app);
				setupPresetTests(app);
				setupLogger(app);

				app.setVisibility(true);
			}
		});
	}

}
