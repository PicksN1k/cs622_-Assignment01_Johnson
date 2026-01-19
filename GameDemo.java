public class GameDemo {

    public static void main(String[] args) {

        Mario mario = new Mario(0, 0, 3);
        DonkeyKong donkeyKong = new DonkeyKong(10, 5);

        Map map = new Map(20, 20);
        // Ladder placed at (2, 0) so Mario can reach it by moving RIGHT twice
        map.addLadder(new Ladder(2, 0, 5));

        System.out.println("Starting Donkey Pong demo...\n");

        System.out.println("Map created: " + map.getWidth() + "x" + map.getHeight());
        System.out.println("Mario starting lives: " + mario.getLives());
        System.out.println();

        // --- Demo tick 1: Mario movement + update ---
        System.out.println("=== Tick 1 ===");
        mario.move(Direction.RIGHT);
        mario.setX(mario.getX() + 1);   // reflect movement in position
        mario.update();
        donkeyKong.update();
        System.out.println();

        // --- Demo tick 2: Mario moves again and checks ladder, then Donkey Kong throws a barrel ---
        System.out.println("=== Tick 2 ===");

        // Move Mario to (2,0) where the ladder is
        mario.move(Direction.RIGHT);
        mario.setX(mario.getX() + 1);

        // Ladder interaction (if Mario is on a ladder, climb it)
        if (map.hasLadderAt(mario.getX(), mario.getY())) {
            System.out.println("Mario found a ladder at (" + mario.getX() + "," + mario.getY() + ")");
            mario.climb(map); // should move Mario up by 1 (symbolic) or print climb message
        } else {
            System.out.println("Mario is not on a ladder.");
        }

        // Donkey Kong throws a barrel
        Barrel barrel1 = donkeyKong.throwBarrel();
        barrel1.update();
        System.out.println();

        // --- Demo tick 3: Force collision between barrel and Mario ---
        System.out.println("=== Tick 3 ===");
        System.out.println("Forcing barrel collision by placing barrel on Mario's position...");
        barrel1.setX(mario.getX());
        barrel1.setY(mario.getY());

        if (barrel1.collidesWith(mario)) {
            barrel1.onCollide(mario);
        } else {
            System.out.println("No collision occurred.");
        }
        System.out.println();

        // --- Demo tick 4: Show method overloading (jump) ---
        System.out.println("=== Tick 4 ===");
        mario.jump();
        mario.jump(5);
        System.out.println();

        // --- Demo tick 5: Another barrel throw + collision check (no forced collision) ---
        System.out.println("=== Tick 5 ===");
        Barrel barrel2 = donkeyKong.throwBarrel();
        barrel2.update();

        if (barrel2.collidesWith(mario)) {
            barrel2.onCollide(mario);
        } else {
            System.out.println("Barrel #2 did not collide with Mario.");
        }
        System.out.println();

        System.out.println("Total barrels thrown: " + donkeyKong.getBarrelsThrown());
        System.out.println("Mario ending lives: " + mario.getLives());
        System.out.println("\nGame demo finished.");
    }
}