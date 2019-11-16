package ch.tschouns.burningForrest.sim;

import ch.tschouns.burningForrest.render.ComponentRenderer;

public interface ForrestComponent {
    void Update(float timeElapsed);
    void Render(ComponentRenderer renderer);
}
