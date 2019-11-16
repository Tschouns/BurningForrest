package ch.tschouns.burningForrest.sim;

public interface Field {
    int getXCoordinate();
    int getYCoordinate();
    void setNewForrestObject(ForrestComponent object);
}
