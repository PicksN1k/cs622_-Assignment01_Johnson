public class GameDemo {

    public static void main(String[] args) {

        Mario mario = new Mario(0, 0, 3);
        DonkeyKong donkeyKong = new DonkeyKong(10, 5);

        System.out.println("Starting Donkey Pong demo...\n");

        mario.move(Direction.RIGHT);
        mario.jump();

        Barrel b1 = donkeyKong.throwBarrel();
        b1.update();

        Barrel b2 = donkeyKong.throwBarrel();
        b2.update();

        System.out.println("\nTotal barrels thrown: " + donkeyKong.getBarrelsThrown());
        System.out.println("Game demo finished.");
    }
}