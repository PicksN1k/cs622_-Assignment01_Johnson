//The goal of this class is to represent a game map with width and height attributes, along with methods to retrieve these attributes and check positions of entities.
public class Map {
    private int width;
    private int height;

    public Map(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isInsideMap(int x, int y) {
        return x >= 0 && x <= width && y >= 0 && y <= height;
    }
}
