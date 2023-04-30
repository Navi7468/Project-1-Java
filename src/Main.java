import Utils.monster;
import Utils.player;

public class Main {

    public static class Game {

        player player = new player();

        public void Start() {
            System.out.println("Enter 'q' at any time to quit");
        }
    }

    public static void WelcomeMessage() {
        System.out.println("=====================================================");
        System.out.println("  Welcome to Labyrinth Quest!");
        System.out.println("  You find yourself trapped in a mysterious maze, filled with untold riches and deadly foes.");
        System.out.println("  Your goal is to navigate through the maze, collect as much gold as you can, and reach the exit before your health runs out.");
        System.out.println("  But be warned - danger lurks around every corner, and the maze is full of traps and monsters that will test your skills and cunning.\n\n");
        System.out.println("=====================================================\n\n");
    }

    public static void main(String[] args) {
        WelcomeMessage();
        Game game = new Game();
        game.Start();
    }
}
