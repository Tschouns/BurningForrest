package ch.tschouns.burningForrest.sim;

import ch.tschouns.burningForrest.render.ComponentRenderer;

public interface ForrestComponent {
    void Update(int millisecondsElapsed);
    void Render(ComponentRenderer renderer);
}
