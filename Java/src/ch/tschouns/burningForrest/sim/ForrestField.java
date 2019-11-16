package ch.tschouns.burningForrest.sim;

import ch.tschouns.burningForrest.render.ComponentRenderer;

public class ForrestField implements Field, ForrestComponent {
    private final int xCoord;
    private final int yCoord;
    private ForrestComponent forrestObject;

    public ForrestField(
            int xCoord,
            int yCoord,
            ForrestComponent objectOnField) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.forrestObject = objectOnField;
    }

    public int getXCoordinate() {

        return this.xCoord;
    }

    public int getYCoordinate() {

        return this.yCoord;
    }

    public ForrestComponent getObject() {

        return this.forrestObject;
    }

    public void setNewForrestObject(ForrestComponent object) {

        this.forrestObject = object;
    }

    @Override
    public void update(int millisecondsElapsed) {
        this.forrestObject.update(millisecondsElapsed);
    }

    @Override
    public void render(ComponentRenderer renderer) {
        renderer.drawGround();
        this.forrestObject.render(renderer);
    }
}
