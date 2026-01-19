import java.util.ArrayList;
import java.util.List;

public class GameDemo {

    public static void main(String[] args) {

        Mario mario = new Mario(0, 0, 3);
        DonkeyKong donkeyKong = new DonkeyKong(10, 5);

        Map map = new Map(20, 20);
        // Ladder placed at (2, 0) so Mario can climb it
        map.addLadder(new Ladder(2, 0, 5));

        List<Barrel> barrels = new ArrayList<>();

        System.out.println("Starting Donkey Pong demo...\n");

        System.out.println("Map created: " + map.getWidth() + "x" + map.getHeight());
        System.out.println("Mario starting lives: " + mario.getLives());
        System.out.println();

        System.out.println("=== Tick 1 ===");

        mario.move(Direction.RIGHT);
        mario.setX(mario.getX() + 1);

        // Update all objects
        mario.update();
        donkeyKong.update();
        for (Barrel b : barrels) {
            b.update();
        }
        System.out.println();

        System.out.println("=== Tick 2 ===");

        mario.move(Direction.RIGHT);
        mario.setX(mario.getX() + 1);

        // Ladder interaction
        if (map.hasLadderAt(mario.getX(), mario.getY())) {
            System.out.println("Mario found a ladder at (" + mario.getX() + "," + mario.getY() + ")");
            mario.climb(map);
        }

        // Donkey Kong throws a barrel
        Barrel barrel1 = donkeyKong.throwBarrel();
        barrels.add(barrel1);

        // Update all objects
        mario.update();
        donkeyKong.update();
        for (Barrel b : barrels) {
            b.update();
        }
        System.out.println();

        System.out.println("=== Tick 3 ===");
        System.out.println("Forcing barrel collision by placing barrel on Mario's position...");

        barrel1.setX(mario.getX());
        barrel1.setY(mario.getY());

        if (barrel1.collidesWith(mario)) {
            barrel1.onCollide(mario);
        }

        // Update all objects
        mario.update();
        donkeyKong.update();
        for (Barrel b : barrels) {
            b.update();
        }
        System.out.println();

        System.out.println("=== Tick 4 ===");

        mario.jump();
        mario.jump(5);

        // Update all objects
        mario.update();
        donkeyKong.update();
        for (Barrel b : barrels) {
            b.update();
        }
        System.out.println();

        System.out.println("=== Tick 5 ===");

        Barrel barrel2 = donkeyKong.throwBarrel();
        barrels.add(barrel2);

        if (barrel2.collidesWith(mario)) {
            barrel2.onCollide(mario);
        } else {
            System.out.println("Barrel #2 did not collide with Mario.");
        }

        // Update all objects
        mario.update();
        donkeyKong.update();
        for (Barrel b : barrels) {
            b.update();
        }
        System.out.println();

        System.out.println("Total barrels thrown: " + donkeyKong.getBarrelsThrown());
        System.out.println("Mario ending lives: " + mario.getLives());
        System.out.println("\nGame demo finished.");
    }
}