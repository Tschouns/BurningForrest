package ch.tschouns.burningForrest.graphics;

import ch.tschouns.burningForrest.render.ComponentRenderer;

import javax.swing.*;
import java.awt.*;

public class FrameFieldRenderer implements ComponentRenderer {
    private final int fieldPosX;
    private final int fieldPosY;
    private final int fieldWidth;
    private final int fieldHeight;
    private final Graphics graphics;

    public FrameFieldRenderer(Graphics graphics, int fieldPosX, int fieldPosY, int fieldWidth, int fieldHeight) {
        this.graphics = graphics;
        this.fieldPosX = fieldPosX;
        this.fieldPosY = fieldPosY;
        this.fieldWidth = fieldWidth;
        this.fieldHeight = fieldHeight;
    }

    @Override
    public void drawGround() {
        this.graphics.setColor(Color.white);
        graphics.drawRect(this.fieldPosX, this.fieldPosY, this.fieldWidth, this.fieldHeight);
    }

    @Override
    public void drawTree(float sizePercent) {
        this.graphics.setColor(Color.green);
        this.DrawTrunk(sizePercent);
    }

    @Override
    public void drawFlames(float sizePercent) {
        var flameHeight = (int)((sizePercent / 100) * this.fieldHeight);

        this.graphics.setColor(Color.red);
        this.graphics.fillOval(
                this.fieldPosX / 4,
                this.fieldPosY + (fieldHeight - flameHeight),
                this.fieldWidth / 2,
                flameHeight);
    }

    @Override
    public void drawCinders(float sizePercent) {
        this.graphics.setColor(Color.black);
        this.DrawTrunk(sizePercent);
    }

    private void DrawTrunk(float sizePercent) {
        var trunkHeight = (int)((sizePercent / 100) * this.fieldHeight);
        this.graphics.fillRect(
                this.fieldPosX + (this.fieldWidth / 3),
                this.fieldPosY + (this.fieldHeight - trunkHeight),
                this.fieldWidth / 3,
                trunkHeight);
    }
}
