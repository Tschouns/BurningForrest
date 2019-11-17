package ch.tschouns.burningForrest.sim;

import ch.tschouns.burningForrest.render.ComponentRenderer;

public class Cinders implements ForrestComponent {
    private final float treeSize;

    public Cinders(float treeSize) {
        this.treeSize = treeSize;
    }

    @Override
    public void update(int millisecondsElapsed) {

    }

    @Override
    public void render(ComponentRenderer renderer) {
        renderer.drawCinders(this.treeSize);
    }
}
