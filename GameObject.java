
//The goal of this class is to represent a generic game object with position attributes and an update method. This will be inheirited by specific game object classes.
public abstract class GameObject {

    private int x;
    private int y;

    //setting and getting methods for x and y coordinates, so that objects can be moved and tracked.

    public GameObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    
    public abstract void update();

    public boolean collidesWith(GameObject other) {
        return this.x == other.x && this.y == other.y;
    }
}