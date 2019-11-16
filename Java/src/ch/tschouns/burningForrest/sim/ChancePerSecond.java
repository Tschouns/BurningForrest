package ch.tschouns.burningForrest.sim;

import java.util.Random;

public class ChancePerSecond {
    private final float chancePercent;
    private final Random random = new Random();
    private int totalMillisecondsElapsed = 0;
    private int timeLastChecked = 0;

    public ChancePerSecond(float chancePercent) {
        this.chancePercent = chancePercent;
    }

    public boolean check(int millisecondsElapsed) {
        this.totalMillisecondsElapsed += millisecondsElapsed;
        if (this.totalMillisecondsElapsed - this.timeLastChecked >= 1000) {
            this.timeLastChecked = this.totalMillisecondsElapsed;
            return this.checkOnce();
        }

        return false;
    }

    private boolean checkOnce() {
        return this.random.nextFloat() % 100f < this.chancePercent;
    }
}
