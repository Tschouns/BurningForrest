package ch.tschouns.burningForrest.sim;

import ch.tschouns.burningForrest.render.ComponentRenderer;

public interface ForrestComponent {
    void update(int millisecondsElapsed);
    void render(ComponentRenderer renderer);
}
