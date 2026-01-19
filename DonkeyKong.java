
//The goal of this class is to represent the DonkeyKong character in the game, which can throw barrels.
public class DonkeyKong extends GameObject {

    private int barrelsThrown = 0;

    public DonkeyKong(int x, int y) {
        super(x, y);
    }

    @Override
    public void update() {
        System.out.println("Donkey Kong is guarding.");
    }
    
    // Method for Donkey Kong to throw a barrel
    public Barrel throwBarrel() {
        barrelsThrown++;
        System.out.println("Donkey Kong throws barrel #" + barrelsThrown);
        return new Barrel(getX(), getY(), 1, 1.5);
    }

    public int getBarrelsThrown() {
        return barrelsThrown;
    }
}