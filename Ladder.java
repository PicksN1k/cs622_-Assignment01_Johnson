//adding ladders to the map that mario can use
public class Ladder {

    private int x;
    private int y;
    private int height;

    public Ladder(int x, int y, int height) {
        this.x = x;
        this.y = y;
        this.height = height;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public int getHeight() { return height; }
}