package ch.tschouns.burningForrest.sim;

import ch.tschouns.burningForrest.render.ComponentRenderer;

public class EmptyGround implements ForrestComponent {
    private final Field field;
    private final ChancePerSecond chance = new ChancePerSecond(0.01f);

    public EmptyGround(Field field) {
        this.field = field;
    }

    @Override
    public void update(int millisecondsElapsed) {
        if (this.chance.check(millisecondsElapsed)) {
            this.field.setNewForrestObject(new GrowingTree(0.1f));
        }
    }

    @Override
    public void render(ComponentRenderer renderer) {
        // Don't do anything.
    }
}
