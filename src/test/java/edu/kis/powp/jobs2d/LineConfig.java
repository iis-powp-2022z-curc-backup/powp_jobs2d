package edu.kis.powp.jobs2d;

import edu.kis.legacy.drawer.shape.line.AbstractLine;
import java.awt.Color;

public class LineConfig extends AbstractLine {
  public LineConfig(Color color, boolean isDotted, float thickness) {
    super();
    this.color = color;
    this.dotted = isDotted;
    this.thickness = thickness;
  }
}