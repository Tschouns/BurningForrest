package ch.tschouns.burningForrest.render;

public interface ComponentRenderer {
    void DrawGround();
    void DrawTree(float sizePercent);
    void DrawFlames(float sizePercent);
    void DrawConders(float sizePercent);
}
