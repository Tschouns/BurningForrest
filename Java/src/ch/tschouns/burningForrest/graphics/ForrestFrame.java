package ch.tschouns.burningForrest.graphics;

import ch.tschouns.burningForrest.render.ComponentRenderer;

import javax.swing.*;
import java.awt.*;

public class ForrestFrame extends JFrame {
    private final int paddingX = 20;
    private final int paddingY = 40;
    private final int numberOfFieldsHorizontal;
    private final int numberOfFieldsVertical;

    public ForrestFrame(
            int numberOfFieldsHorizontal,
            int numberOfFieldsVertical) {
        this.numberOfFieldsHorizontal = numberOfFieldsHorizontal;
        this.numberOfFieldsVertical = numberOfFieldsVertical;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawLine(10, 10, 200, 300);
        graphics.fillRect(20, 40, 300, 500);
    }

}
