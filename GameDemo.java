public class GameDemo {

    public static void main(String[] args) {

        Mario mario = new Mario(0, 0, 3);

        System.out.println("Starting Donkey Pong demo...\n");

        mario.move(Direction.RIGHT);
        mario.move(Direction.UP);
        mario.jump();
        mario.move(Direction.LEFT, 2);
        mario.jump(5);

        mario.update();
    }
}