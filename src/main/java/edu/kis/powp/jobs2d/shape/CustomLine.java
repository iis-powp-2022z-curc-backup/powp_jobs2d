package edu.kis.powp.jobs2d.shape;

import edu.kis.legacy.drawer.shape.line.AbstractLine;
import java.awt.Color;

public class CustomLine extends AbstractLine {

    public CustomLine(Color color, float thickness, boolean dotted) {
        super();
        this.color = color;
        this.thickness = thickness;
        this.dotted = dotted;
    }

}
