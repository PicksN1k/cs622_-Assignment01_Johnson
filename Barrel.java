public class Barrel extends GameObject {
    private int damage;
    private double speed = 1.5;

    public Barrel(int x, int y, int damage) {
        super(x, y);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public void update() {
        System.out.println("Barrel rolling at speed " + speed);
    }
}
