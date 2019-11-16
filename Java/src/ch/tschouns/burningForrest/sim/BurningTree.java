package ch.tschouns.burningForrest.sim;

import ch.tschouns.burningForrest.render.ComponentRenderer;

public class BurningTree implements ForrestComponent {
    @Override
    public void update(int millisecondsElapsed) {

    }

    @Override
    public void render(ComponentRenderer renderer) {
        renderer.drawTree(100);
        renderer.drawFlames(100);
    }
}
