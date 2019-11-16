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
    public void DrawGround() {

    }

    @Override
    public void DrawTree(float sizePercent) {

    }

    @Override
    public void DrawFlames(float sizePercent) {

    }

    @Override
    public void DrawCinders(float sizePercent) {

    }
}
