import Players.Player;

import java.util.Scanner;

public class AdventureGame {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static Player player = new Player();

    public static void main(String[] args) {
        System.out.println("Welcome. Would you like to play?");
        String userInput = SCANNER.next();
        boolean wouldLikeToPlay = userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
        if (!wouldLikeToPlay) System.out.println("Too bad.");
        initPlayer();
    }

    static void startGame() {

    }

    static void initPlayer() {
        System.out.println("Hi welcome to the metaverse." + " ".repeat(10) + "there's so much room in here");
        System.out.println("What's your name?");
        String name = SCANNER.next();
        player.setName(name);
        System.out.printf("Hi, %s, are you ready to get started?\n", name);
        SCANNER.next();
        System.out.println("Great. Lets go...");

    }


    static void showHealthBar(int currHealth) {
        int healthBars = currHealth / 2;
        System.out.println("Health: [" + "=".repeat(healthBars) + " ".repeat(50 - healthBars) + "]");

    }


}
