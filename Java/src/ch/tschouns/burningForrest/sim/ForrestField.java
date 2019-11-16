package ch.tschouns.burningForrest.sim;

import ch.tschouns.burningForrest.render.ComponentRenderer;

public class ForrestField implements ForrestComponent {
    private ForrestComponent forrestObject;

    public ForrestField(ForrestComponent objectOnField) {
        this.forrestObject = objectOnField;
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
