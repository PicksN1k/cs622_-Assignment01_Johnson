
//This is to act as the barrel that will roll and cause damage to players upon collision.
public class Barrel extends GameObject {

    private int damage;
    private double speed;
    private Direction direction;

    public Barrel(int x, int y, int damage, double speed, Direction direction) {
        super(x, y);
        this.damage = damage;
        this.speed = speed;
        this.direction = direction;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public void update() {
        System.out.println("Barrel rolling "+ direction + " at speed " + speed);
    }
    public void onCollide(Mario mario) {
    System.out.println("Barrel collided with Mario!");
    mario.takeDamage(1);
}
}