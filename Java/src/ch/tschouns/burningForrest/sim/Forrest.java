package ch.tschouns.burningForrest.sim;

import java.util.ArrayList;
import java.util.List;

public class Forrest {
    private final List<List<ForrestField>> forrestFieldRows = new ArrayList<List<ForrestField>>();
    private int width;
    private int height;

    public Forrest(int width, int height) {
        this.width = width;
        this.height = height;

        for (int y = 0; y < height; y++) {
            var newRow = new ArrayList<ForrestField>();
            for (int x = 0; x < width; x++) {
                var newField = new ForrestField(x, y, null);
                var emptyGround = new EmptyGround(newField);
                newField.setNewForrestObject(emptyGround);
                newRow.add(newField);
            }

            this.forrestFieldRows.add(newRow);
        }
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return height;
    }

    public ForrestComponent getField(int x, int y) {
        return this.forrestFieldRows.get(y).get(x);
    }

    public void updateAllComponents(int millisecondsElapsed)
    {
        for (List<ForrestField> row : this.forrestFieldRows) {
            for (ForrestComponent component : row) {
                component.update(millisecondsElapsed);
            }
        }
    }
}
