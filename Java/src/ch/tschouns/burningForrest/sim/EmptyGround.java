package ch.tschouns.burningForrest.sim;

import ch.tschouns.burningForrest.render.ComponentRenderer;

public class EmptyGround implements ForrestComponent {
    private final ChancePerSecond chanceToSpawnTree = new ChancePerSecond(0.001f);
    private final Field field;

    public EmptyGround(Field field) {
        this.field = field;
    }

    @Override
    public void update(int millisecondsElapsed) {
        if (this.chanceToSpawnTree.check(millisecondsElapsed)) {
            this.field.setNewForrestObject(new GrowingTree(this.field));
        }
    }

    @Override
    public void render(ComponentRenderer renderer) {
        // Don't do anything.
    }
}
