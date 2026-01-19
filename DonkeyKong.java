public class DonkeyKong extends GameObject{

     public DonkeyKong(int x, int y) {
        super(x, y);
    }

    @Override
    public void update() {
        System.out.println("DonkeyKong is guarding.");
    }

    public Barrel throwCask() {
        return new Barrel(getX(), getY(), 5);
    }
}