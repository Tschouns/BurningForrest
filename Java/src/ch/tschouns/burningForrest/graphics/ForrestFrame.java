package ch.tschouns.burningForrest.graphics;

import ch.tschouns.burningForrest.sim.Forrest;

import javax.swing.*;
import java.awt.*;

public class ForrestFrame extends JFrame {
    private final int paddingX = 40;
    private final int paddingY = 40;
    private final Forrest forrest;

    public ForrestFrame(Forrest forrest) {
        this.forrest = forrest;
    }

    public void RunSim() {
        var previousTime = System.currentTimeMillis();
        while (true) {
            // Calculate time elapsed
            var currentTime = System.currentTimeMillis();
            var millisecondsElapsed = (int)(currentTime - previousTime);
            previousTime = currentTime;

            // Update
            forrest.UpdateAllComponents(millisecondsElapsed);

            // Draw

        }
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);

        // Calculate the width and height of a single field
        var fieldWidth = (this.getSize().width - (2 * this.paddingX)) / this.forrest.getWidth();
        var fieldHeight = (this.getSize().height - (2 * this.paddingY)) / this.forrest.getHeight();

        // Render each field
        for (var y = 0; y < forrest.getHeight(); y++) {
            for (var x = 0; x < forrest.getWidth(); x++) {
                // Create the renderer

                var fieldPosX = (fieldWidth * x) + this.paddingX;
                var fieldPosY =  (fieldHeight * y) + this.paddingY;
                var renderer = new FrameFieldRenderer(graphics, fieldPosX, fieldPosY, fieldWidth, fieldHeight);

                // Render the current field with it
                this.forrest.getField(x, y).Render(renderer);
            }
        }
    }
}
