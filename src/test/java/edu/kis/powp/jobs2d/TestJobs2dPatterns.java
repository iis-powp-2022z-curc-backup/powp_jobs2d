package edu.kis.powp.jobs2d;

import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.drivers.adapter.DriverAdapter;
import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapter;
import edu.kis.powp.jobs2d.drivers.command.fabric.CommandFactory;
import edu.kis.powp.jobs2d.features.DrawerFeature;
import edu.kis.powp.jobs2d.features.DriverFeature;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestJobs2dPatterns {
    private final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    /**
     * Setup test concerning preset figures in context.
     *
     * @param application Application context.
     */
    private static void setupPresetTests(Application application) {
        application.addTest("Figure Joe 1",
                event -> FiguresJoe.figureScript1(DriverFeature.getDriverManager().getCurrentDriver()));
        application.addTest("Figure Joe 2",
                event -> FiguresJoe.figureScript2(DriverFeature.getDriverManager().getCurrentDriver()));
        application.addTest("Rectangle",
                event -> CommandFactory.getRectangle().execute(DriverFeature.getDriverManager().getCurrentDriver()));
        application.addTest("Trapeze",
                event -> CommandFactory.getTrapeze().execute(DriverFeature.getDriverManager().getCurrentDriver()));
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

        Job2dDriver testDriver = new DriverAdapter();
        DriverFeature.addDriver("Driver Adapter", testDriver);

        Job2dDriver lineDrawerAdapter = new LineDrawerAdapter();
        DriverFeature.addDriver("Line Drawer Adapter", lineDrawerAdapter);

        DriverFeature.updateDriverInfo();
    }

    /**
     * Setup menu for adjusting logging settings.
     *
     * @param application Application context.
     */
    private static void setupLogger(Application application) {
        application.addComponentMenu(Logger.class, "Logger", 0);
        application.addComponentMenuElement(Logger.class, "Clear log", (ActionEvent e) -> application.flushLoggerOutput());
        application.addComponentMenuElement(Logger.class, "Fine level", (ActionEvent e) -> logger.setLevel(Level.FINE));
        application.addComponentMenuElement(Logger.class, "Info level", (ActionEvent e) -> logger.setLevel(Level.INFO));
        application.addComponentMenuElement(Logger.class, "Warning level", (ActionEvent e) -> logger.setLevel(Level.WARNING));
        application.addComponentMenuElement(Logger.class, "Severe level", (ActionEvent e) -> logger.setLevel(Level.SEVERE));
        application.addComponentMenuElement(Logger.class, "OFF logging", (ActionEvent e) -> logger.setLevel(Level.OFF));
    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Application app = new Application("2d jobs Visio");
            DrawerFeature.setupDrawerPlugin(app);

            DriverFeature.setupDriverPlugin(app);
            setupDrivers(app);
            setupPresetTests(app);
            setupLogger(app);

            app.setVisibility(true);
        });
    }

}
