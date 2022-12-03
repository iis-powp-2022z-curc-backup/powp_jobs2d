package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.factories.SquareFactory;
import edu.kis.powp.jobs2d.factories.TriangleFactory;

public class SelectTestFigureOptionListener implements ActionListener {

  private final DriverManager driverManager;
  private final FigureTypes type;

  public SelectTestFigureOptionListener(DriverManager driverManager, FigureTypes type) {
    this.driverManager = driverManager;
    this.type = type;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Job2dDriver driver = driverManager.getCurrentDriver();
    switch (type) {
      case FIGURE_JOE_1:
        FiguresJoe.figureScript1(driver);
        break;
      case FIGURE_JOE_2:
        FiguresJoe.figureScript2(driver);
        break;
      case RECTANGLE:
        DriverCommand rectangle = SquareFactory.square(driver);
        rectangle.execute(driver);
        break;
      case TRIANGLE:
        DriverCommand triangle = TriangleFactory.triangle(driver);
        triangle.execute(driver);
        break;
      default:
        System.out.println("Warning: Operation does not exist!");
    }
  }
}