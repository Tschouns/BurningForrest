package ch.tschouns.burningForrest.sim;

import ch.tschouns.burningForrest.render.ComponentRenderer;

public class EmptyGround implements ForrestComponent {
    @Override
    public void update(int millisecondsElapsed) {
        // Don't do anything.
    }

    @Override
    public void render(ComponentRenderer renderer) {
        // Don't do anything.
    }
}
