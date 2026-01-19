import java.util.ArrayList;
import java.util.List;

//The goal of this class is to represent a game map with width and height attributes, along with methods to retrieve these attributes and check positions of entities.
public class Map {

    private int width;
    private int height;
    private List<Ladder> ladders = new ArrayList<>();

    public Map(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void addLadder(Ladder ladder) {
        ladders.add(ladder);
    }

    public List<Ladder> getLadders() {
        return ladders;
    }

    public boolean hasLadderAt(int x, int y) {
        for (Ladder ladder : ladders) {
            if (ladder.getX() == x && ladder.getY() == y) {
                return true;
            }
        }
        return false;
    }
    public boolean canMoveUpFrom(int x, int y) {
        return hasLadderAt(x, y);
    }

    public int getWidth() { return width; }
    public int getHeight() { return height; }
}