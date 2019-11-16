package ch.tschouns;

import ch.tschouns.burningForrest.graphics.ForrestFrame;
import ch.tschouns.burningForrest.sim.Forrest;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        var width = 100;
        var height = 70;
        var forrest = new Forrest(width, height);

        var frame = new ForrestFrame();
        frame.setSize(width * 10,height * 10);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
