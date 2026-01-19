//The goal of this class is to represent the Mario character in the game, inheriting from GameObject and adding specific attributes and behaviors, such as lives and movement.
public class Mario extends GameObject {
     private int lives;

    public Mario(int x, int y, int lives) {
        super(x, y);
        this.lives = lives;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    // Method overriding
    @Override
    public void update() {
        System.out.println("Mario is updating.");
    }

    // Method overloading
    public void jump() {
        System.out.println("Mario jumps.");
    }

    public void jump(int height) {
        System.out.println("Mario jumps to height: " + height);
    }

     public void move(Direction direction) {
        System.out.println("Mario moves " + direction);
    }

    public void move(Direction direction, int distance) {
        System.out.println("Mario moves " + direction + " by " + distance);
    }
    public void takeDamage(int damage) {
        lives -= damage;
        if (lives < 0) lives = 0;
        System.out.println("Mario takes " + damage + " damage. Lives now: " + lives);
    }
    public void climb(Map map) {
    if (map.canMoveUpFrom(getX(), getY())) {
        setY(getY() + 1); // symbolic upward movement
        System.out.println("Mario climbs up the ladder to y=" + getY());
        } else {
            System.out.println("Mario cannot climb here.");
        }
    }
}

