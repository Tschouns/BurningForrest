package ch.tschouns.burningForrest.sim;

import ch.tschouns.burningForrest.render.ComponentRenderer;

public class GrowingTree implements ForrestComponent {
    private final ChancePerSecond chanceToStartBurning = new ChancePerSecond(0.001f);
    private final Field field;
    private final float growingSpeed;
    private float currentSize = 0;
    private GrowingTree growingTree;

    public GrowingTree(Field field, float growingSpeed) {
        this.field = field;
        this.growingSpeed = growingSpeed;
    }

    @Override
    public void update(int millisecondsElapsed) {
        this.currentSize += this.growingSpeed * millisecondsElapsed;
        this.currentSize = Math.min(this.currentSize, 100);

        if (this.currentSize > 50 && this.chanceToStartBurning.check(millisecondsElapsed)) {
            this.field.setNewForrestObject(new BurningTree());
        }
    }

    @Override
    public void render(ComponentRenderer renderer) {
        renderer.drawTree(this.currentSize);
    }
}
