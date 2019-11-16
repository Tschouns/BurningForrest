package ch.tschouns.burningForrest.sim;

import ch.tschouns.burningForrest.render.ComponentRenderer;

public class ForrestField implements ForrestComponent {
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

    public int getXCoord() {
        return this.xCoord;
    }

    public int getYCoord() {
        return this.yCoord;
    }

    public ForrestComponent getObject() {
        return this.forrestObject;
    }

    public void setObject(ForrestComponent object) {
        this.forrestObject = object;
    }

    @Override
    public void Update(float timeElapsed) {
        this.forrestObject.Update(timeElapsed);
    }

    @Override
    public void Render(ComponentRenderer renderer) {
        this.forrestObject.Render(renderer);
    }
}
