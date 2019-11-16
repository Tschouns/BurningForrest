package ch.tschouns;

import ch.tschouns.burningForrest.graphics.ForrestFrame;
import ch.tschouns.burningForrest.sim.Forrest;

import javax.swing.*;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        var width = 100;
        var height = 70;
        var forrest = new Forrest(width, height);
        var frame = new ForrestFrame(forrest);

        frame.setSize(width * 10,height * 10);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.RunSim();
    }
}
