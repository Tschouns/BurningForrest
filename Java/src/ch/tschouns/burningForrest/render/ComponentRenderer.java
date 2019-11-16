package ch.tschouns.burningForrest.render;

public interface ComponentRenderer {
    void drawGround();
    void drawTree(float sizePercent);
    void drawFlames(float sizePercent);
    void drawCinders(float sizePercent);
}
