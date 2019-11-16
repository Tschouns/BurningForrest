package ch.tschouns.burningForrest.sim;

import ch.tschouns.burningForrest.render.ComponentRenderer;

public class GrowingTree implements ForrestComponent {
    private final float growingSpeed;
    private float currentSize = 0;

    public GrowingTree(float growingSpeed) {
        this.growingSpeed = growingSpeed;
    }

    @Override
    public void update(int millisecondsElapsed) {
        this.currentSize += this.growingSpeed * millisecondsElapsed;
        this.currentSize = Math.max(this.currentSize, 100);
    }

    @Override
    public void render(ComponentRenderer renderer) {
        renderer.DrawTree(this.currentSize);
    }
}
