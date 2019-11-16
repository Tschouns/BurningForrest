package ch.tschouns.burningForrest.graphics;

import ch.tschouns.burningForrest.sim.Forrest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ForrestFrame extends JFrame implements ActionListener {
    private final int paddingX = 40;
    private final int paddingY = 40;
    private final Timer timer = new Timer(20, this);
    private final Forrest forrest;

    private long previousTime = 0;

    public ForrestFrame(Forrest forrest) {
        this.forrest = forrest;
    }

    public void RunSim() {
        this.previousTime = System.currentTimeMillis();
        this.timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.update();
        this.repaint();
    }

    public void update() {
        // Calculate time elapsed
        var currentTime = System.currentTimeMillis();
        var millisecondsElapsed = (int)(currentTime - this.previousTime);
        this.previousTime = currentTime;

        // Update
        forrest.updateAllComponents(millisecondsElapsed);
    }

    @Override
    public void paint(Graphics graphics) {
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
                this.forrest.getField(x, y).render(renderer);
            }
        }
    }
}
