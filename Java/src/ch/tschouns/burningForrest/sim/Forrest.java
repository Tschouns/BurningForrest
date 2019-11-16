package ch.tschouns.burningForrest.sim;

import java.util.ArrayList;
import java.util.List;

public class Forrest {
    private final List<List<ForrestComponent>> forrestFieldRows = new ArrayList<List<ForrestComponent>>();
    private int width;
    private int height;

    public Forrest(int width, int height) {
        this.width = width;
        this.height = height;

        for (int y = 0; y < height; y++) {
            var newRow = new ArrayList<ForrestComponent>();
            for (int x = 0; x < width; x++) {
                newRow.add(new EmptyGround());
            }

            this.forrestFieldRows.add(newRow);
        }
    }

}
