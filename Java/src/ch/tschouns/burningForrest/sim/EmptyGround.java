package ch.tschouns.burningForrest.sim;

import ch.tschouns.burningForrest.render.ComponentRenderer;

public class EmptyGround implements ForrestComponent {
    @Override
    public void Update(int millisecondsElapsed) {
        // Don't do anything.
    }

    @Override
    public void Render(ComponentRenderer renderer) {
        // Don't do anything.
    }
}
