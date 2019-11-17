package ch.tschouns.burningForrest.sim;

import ch.tschouns.burningForrest.render.ComponentRenderer;

public class BurningTree implements ForrestComponent {
    private final float burningSpeed = 0.01f;
    private final Field field;
    private final float treeSize;

    private float flamePercent = 0;
    private float burntPercent = 0;

    public BurningTree(Field field, float treeSize) {
        this.field = field;
        this.treeSize = treeSize;
    }

    @Override
    public void update(int millisecondsElapsed) {
        this.flamePercent += this.burningSpeed * millisecondsElapsed;
        this.flamePercent = Math.min(this.flamePercent, this.treeSize * 1.2f);

        if (this.flamePercent >= this.treeSize) {
            this.burntPercent += this.burningSpeed * millisecondsElapsed;
        }

        if (this.burntPercent >= 100) {
            this.field.setNewForrestObject(new Cinders(this.treeSize));
        }
    }

    @Override
    public void render(ComponentRenderer renderer) {
        renderer.drawTree(this.treeSize);
        renderer.drawFlames(this.flamePercent);
    }
}
