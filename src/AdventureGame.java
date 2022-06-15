import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AdventureGame {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static String playerName = "";
    public static int playerHealth = 100;
    public static int playerIntelligence;
    public static int playerStrength;

    public static void main(String[] args) {
        System.out.println("Welcome. Would you like to play?");
        String userInput = SCANNER.next();
        boolean wouldLikeToPlay = userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
        if (!wouldLikeToPlay) System.out.println("You don't get a choice in the metaverse");
        initPlayer();
    }

    static void startGame() {

    }

    static void initPlayer() {
        String welcomeMessage = "████████████████ Hi welcome to the metaverse." + " ".repeat(50) + "there's so much room in here ████████████████";
        loadMetaverse();

        log("-".repeat(welcomeMessage.length()), 5);
        log("-".repeat(welcomeMessage.length()), 5);
        log("█".repeat(welcomeMessage.length()), 5);
        log("█".repeat(welcomeMessage.length()), 5);
        log(welcomeMessage, 50);
        log("█".repeat(welcomeMessage.length()), 5);
        log("█".repeat(welcomeMessage.length()), 5);


        log("What's your name?", 50);
        String name = SCANNER.next();
        playerName = name;
        log("Hi " + name + " do you accept our terms and conditions? [y/N]", 50);
        SCANNER.next();
        log("Great. Lets go...", 25);
        log("In the metaverse, your stats are given to you randomly.", 25);
        log("Sort of like the normal 'verse now that I think of it...", 25);
        sleep(500);
        log("Heh...anyways...", 25);
        log("...", 50);
        log("Your stats are as follows: ", 50);
        playerStrength = randomBetween(0, 100);
        playerIntelligence = randomBetween(0, 100);
        showStats();
        log("Do these look good to you? [y/N]", 50);
        SCANNER.nextLine();
        boolean looksGood = SCANNER.next().equalsIgnoreCase("y");
        if (!looksGood) log("Sorry, you'll have to fill out a support ticket.", 25);
        sleep(2000);

        log("I'll show you around.", 25);
        log("...", 50);
        log("...", 50);
        log("...", 50);
        log("Here's the dungeon...", 25);
        sleep(1000);
        log("And here's a picture of our leader", 50);
        sleep(1000);
        log("\n" +
                "▛▘▀▞▘▀▝▘▀▝▘▀▝▘▀▝▘▀▝▘▀▝▘▀▝▘▀▝▘▀▝▘▀▝▘▀▝▘▀▝▘▀▝▘▀▞▘▀▝▜\n" +
                "▌▞▗ ▘▘▘▘▘▘▘▘▘▝▖▘▝ ▚▝▄▙▙▙▙▙▞▄▚▝▗▘▝▗▝ ▝ ▘▝▝ ▘▘▘▗▝▝▝▐\n" +
                "▌▖▘▞▝▝ ▘▞ ▘▝▝▗▗▝▞▟▟█████▜▟▜▜▛▛▙▟▄ ▖▘▝ ▘▝ ▘▘▝▝▗▝ ▘▟\n" +
                "▌▖▘▖▘▝▝▗ ▝▝▝▗▗▗███▜▛█▙█▟▜▜▛█▜▛▛▛▛▙▄ ▘▝ ▘▝ ▘▘▝  ▘▖▐\n" +
                "▌▗▘▗▝▝▗▗▝ ▘▖▄▟▜▙█▛▙██▜▙▜▜█▛▙█▟▛▛▛█▜▙▚ ▘▝ ▘▖▘ ▘▘▖▗▐\n" +
                "▌▖ ▘ ▘▗  ▘▖▟▟▜█▜▙▛▛▞▞▚▚▜▛▙▜▀▞▞▛▟▛████▜▖▘ ▘  ▘▖▗ ▖▐\n" +
                "▌ ▘▝ ▘▗▝▝▗▐▟▜█▜▙▙▜▀▝▝▀▀▘▘▘▘▘▖ ▚▚▜▌▙▙███▖▘▗▝ ▘ ▗ ▖▐\n" +
                "▌▝▝▝▝▗ ▖▖▖█▙█▛▌▚▗ ▖▘▖   ▖▗ ▖ ▝ ▗▗▝▗▚▜▟▙▙▗ ▗ ▖▝ ▗ ▐\n" +
                "▌▝▗▗▗ ▖ ▗▐█▟█▜▐▗ ▝ ▖ ▘▝     ▝ ▘▗ ▝▖▞▞▟▜█▌▝  ▗ ▝  ▜\n" +
                "▌▝   ▖ ▘▖▟██▚▚▚▗▝ ▘▗▝ ▖▗ ▖▘▝ ▝▗ ▝▖▖▞▞▞▛██ ▖▘ ▝▗▝▗▐\n" +
                "▌ ▘▝ ▖▘▖ ▙█▟▛▌▌▖▘▘▝  ▖     ▗▝ ▗▝▗▗▗▘▌▛▛▟▌   ▘▖ ▖ ▐\n" +
                "▌▘▝ ▘   ▘▜▛█▙▜▐▝▝ ▘ ▘  ▘ ▘▗  ▝ ▗ ▖▖▚▚▜▟█▚▝ ▘ ▖▘ ▝▐\n" +
                "▌ ▘▗▝ ▘▘▖▗▜█▟▛▙▚▘▘▝▗▗ ▘ ▘  ▗▝ ▝ ▖▗▝▐▐▜▟█▘ ▗ ▘ ▗▝ ▟\n" +
                "▌ ▘ ▖▝ ▖▗▄▜██▞▙▚▚▀▝▝▖▌▌▘▖▘▘▖▞▞▌▌▞▝▞▌▛▛█▛▙▝  ▗▝  ▖▐\n" +
                "▌▝ ▘ ▖▘  ▛▙█▙▛▙▚▚▚▛▛▞▄▝▞  ▚▘▌▌▌▌▙▚▌▚▛▛██▟  ▝  ▗ ▗▐\n" +
                "▌ ▘▖▘ ▗▝ ▜▞▟█▐▗▚▜▘▚▀▗ ▘▗▝ ▘▖▝▗▝▀▞▞▌▌▌▛█▟▐▘▝ ▗▝ ▗ ▐\n" +
                "▌▝ ▖ ▘ ▗ ▖▀▜▜▞▖▖▘▝▗▝ ▗▝▖▖▘▚ ▘ ▖▘ ▘▞ ▞▛▙▌▌▘ ▝  ▖ ▖▐\n" +
                "▌▝ ▖▘▝▝ ▗ ▜▝▛▟▗ ▝▝ ▗▝ ▖▖▖▝▖▘▚▗ ▝▝▗ ▚▐▟▚▚▘▗▝ ▖▘ ▖▗▐\n" +
                "▌ ▘▗▝▗▗▝ ▗▝▚▜▚▚▝▖▖▝  ▞▗▘ ▖▝▞▖▗▝ ▝ ▝▖▙▛▟▐   ▖ ▗ ▖ ▐\n" +
                "▌▘▝ ▖▖▗ ▝  ▚▀▙▚▗ ▖▝ ▘ ▚▝  ▘▞▗ ▗▝ ▘▚▐▞▙▚▘ ▘▗ ▝   ▘▐\n" +
                "▌▝▝▗▗▗▗▝ ▘▘ ▚▙▚▘▖▗▗ ▖▚▄▖▚▝▄▞▖▖ ▖▘▚▝▟▟▚▘ ▗ ▖▗ ▝▝ ▝▐\n" +
                "▌▘▘▖▖▗ ▖▘▖▘▝ ▟▚▚▝ ▗ ▗▗▝▞▙▜▐▐▝ ▘▗▝▗▚▙▙  ▗    ▝ ▖▘▗▐\n" +
                "▌▝▖▖▗▗ ▖▖▗▝ ▘▐▞▖▘▘▖▐▗▗▘▖▖▝▗▝▐▝▞▗▝▖▌▙▚ ▘ ▗▝ ▘ ▘ ▗ ▐\n" +
                "▌▘▗ ▖▗▗ ▖▖▖▘▝▗▜▝▘▘ ▘▚▀▞▞▝▀▞▀▀▘▘▗▗▐▐▟ ▗ ▘  ▖▝ ▖▝ ▗▐\n" +
                "▌▝▗▝▗▗▗▗▗ ▖▘▘▖▛▌▌▘▘▖▗▝▗▝▝▖▞▝▞ ▘▖▖▌▙▛ ▖ ▖▘  ▖▗ ▖▝ ▐\n" +
                "▌▚▗▝▗▗▗▗▗▝▗▝▗▝▜▜▞▞▗▗▗▝▗▘▌▚▝▝ ▞▗▗▐▞▙▛▖ ▖  ▝    ▗ ▝▐\n" +
                "▌▖▖▞▗ ▖▖▖▝▗▝ ▖▛▙▜▟▖▖▖▝ ▗ ▗ ▘▖▖▚▞▙█▜▌▗  ▖▘▗ ▘▝  ▖▘▐\n" +
                "▌▖▖▖▖▘▖▗ ▚▗▝▗ ▛▞▌▙█▚▐ ▘▖▝▗ ▚▝▞▙█▜▜▚▌ ▝  ▖ ▗ ▖▝  ▗▐\n" +
                "▌▞▗▗ ▘▖▖▘▖▗▝▗▚▛▞▞▞▞█▙█▞▄▚▚▚▙█▜█▟▜▜▚█▙▝ ▘ ▝ ▗ ▖▘▝ ▐\n" +
                "▌▖▖▖▘▘▖ ▘▖▘▄▜▜▜▚▚▘▚▚▚▙█▜▛█▜▙▛▛▟▞▛▞▞▙██▜▄▌▖▘ ▗ ▖▘ ▜\n" +
                "▌▞▗▝▝▖▝▝▄▄▛▟▛▞▙▌▌▞▖▞▝▞▞▌▛▞▙▚▜▜▐▐▗▚▜▜▟▟▜▙▛▛█▜▄▄▄▗▘▐\n" +
                "▙▐▄▙▙█████████▙███▟██████████████████████████▙▜▜▜█\n" +
                "▛▙▙▙▙█▛▞▝▝▞▌▜█▛▝▛▝▐▝▞██▙▘▌▘▜▘▜█▌▜▛▀▗▝▀█▀▝▖▀██▜▜▜▚█\n" +
                "▛▙▌▙▚███ ██▌▝▀▘▝▛ ▀▀▜████▘▄█▘▐█▌▐▌▐████ ██▙██▛▙▜▚█\n" +
                "█▚▛▟▜███ ▟█▌▐█▌▝▛ █████▛ ▟██▌▐█▘▐▙▝█▛▘█ ▜█▀▜█▛▞▙▜▟\n" +
                "▛▙▜▚▛███▙██▙▟█▙▟█▄▄▄▄██▙▄▄▄▄█▄▄▟██▙▄▄███▙▄▟██▛▜▞▙▜\n" +
                "▛▙▛▛▟▛█▛█▜████▜█▛██████▜███████▛█▜██▜███▜██▜▛▛▙▜▞█\n" +
                "█▟▟█▟▟▙█▟▙▙▟▄▙█▄█▟▟▟▟▟▟▙▙▙▙▙▙▙▙█▟▙▙▟▙▙▙▙█▄▙▙█▟▙▙█▟\n" +
                "\n", 3);
        log("In the metaverse, you survive by programming NFTs", 25);
        log("What's an NFT you ask?", 25);
        log("Nobody knows...", 25);
        log("But they're the future", 25);
        log("Let's get moving...", 25);
        log("...", 50);
        log("...", 50);
        log("...", 50);
        sleep(1000);
        log("In the metaverse, things are...", 25);
        log("a̷̬̖̹͌̅̈́ ̷̥̞̙̾́͝b̸̩̻͐̑́͊i̸̫̩͙͓̇́t̸͕͇̓ ̶̟͙́́ḋ̵̞̜̜̊͐̍ỉ̶̱͔͇̊̐f̵̛͇̳̟͉̆̕f̷̼̟͂̀̈́͠ę̵͖̞̜̾̑̒͘r̴̭̱̬̂͛̀͋͠ȇ̴̤̠̏̈́ņ̵̼̰̔t̶̳̼͗̎̊̔", 10);
        sleep(2000);
        log("Woah! What was that?", 50);
        sleep(3000);
        log("OH NO! It l̴͍͇͊ó̵̲͇̫o̸̧͌͝k̷̖̓̓̅š̷̢͕̖̂̌ like the metaverse ḭ̵̲͛ş̸̠̰̈̚͠ ̷̼͓̈͑̕b̴̩̤̹̈́̎͂ê̷̻̙i̶̗͌ņ̶̣̦͗́̊ǵ̸̖̈ attacked by a computer virus", 25);
        log("You were a programmer ï̴̫̆̏n̵͖̥̭̔̔͌ ̴͖̫̱̃̾y̵̦̩̪̕̕ö̵̥̳́̽̒u̶̢̱͔͆ȓ̴̡̧ past life right? [y/N]", 50);
        boolean wasAProgrammer = SCANNER.next().equalsIgnoreCase("y");
        if (wasAProgrammer) log("I need you to hack the mainframes and kill the virus", 50);
        SCANNER.nextLine();
        SCANNER.nextLine();
        log(playerName + ", it's up to you to save the metaverse", 10);
        fightVirus();

    }

    static void fightVirus() {
        log("How would you like to fight the virus?", 25);
        log("1. Major League Hax", 25);
        log("2. The old fashioned way", 25);
        String input = handleInput(new String[]{"1", "2"});
        boolean wantsHax = false;

        // Wants to major-league hax the virus
        if (input.equalsIgnoreCase("1")) {
            wantsHax = true;
            // If player isn't smart enough to hax the virus
            if (playerIntelligence < 40) {
                log("are you sure you're smart enough for that...? Your intelligence level is at " + playerIntelligence, 25);

                // If player is also weak
                if (playerStrength < 40) {
                    sleep(1000);
                    log("Actually, on second thought...You aren't very strong either", 25);
                }
                log(" - would you like to choose again? [y/N]", 25);
                String userAnswer = handleInput(new String[]{"y", "n", "yes", "no"});
                boolean isQuitter = userAnswer.equalsIgnoreCase("y") || userAnswer.equalsIgnoreCase("yes");
                if (isQuitter) {
                    log("Told you...", 50);
                    fightVirus();
                }
                // Player is smart enough to hax the virus
            }
            // Player chooses to fight the virus the old-fashioned way
        } else {
            // Player isn't strong enough to fight the virus the old-fashioned way
            if (playerStrength < 40) {
                log("are you sure you're strong enough for that...? Your strength level is at " + playerStrength, 25);
                // Player also isn't very smart
                if (playerIntelligence < 40) {
                    sleep(1000);
                    log("Actually, on second thought...You aren't very intelligent either...sorry", 25);
                    log("...", 25);
                    log("erm", 25);
                    log("...", 25);
                }
                log(" - would you like to choose again? [y/N]", 25);
                String userAnswer = handleInput(new String[]{"y", "n", "yes", "no"});
                boolean isQuitter = userAnswer.equalsIgnoreCase("y") || userAnswer.equalsIgnoreCase("yes");
                if (isQuitter) {
                    fightVirus();
                }
            }
        }

        // Fight begins
        log("Okay...", 25);
        log("Your current stats are:", 25);
        showStats();

        int virusStrength = randomBetween(0, 50);
        int probability = calcProbability(playerStrength - virusStrength);


        if (wantsHax) {
            log("You chose to use hax on the virus...", 25);
            sleep(3000);
            log("Pretty boring if you ask me", 25);
            log("Anyways, lets get to hacking", 25);
            log("<!--\n" +
                    " ▖▗ ▖▗ ▗                                  ▗ ▗ ▖▗ ▖\n" +
                    "▗ ▖▗ ▗▝  ▘▝ ▘▝ ▘▝ ▖▝ ▖▗ ▖▗ ▖▗ ▘ ▘▝ ▘▝▝ ▘▘▝ ▗ ▖▗ ▖ \n" +
                    " ▖▗ ▝  ▖▘ ▘▗▝ ▖▗ ▖  ▖         ▗ ▝ ▖▝ ▖▝ ▖▘▗ ▗ ▖▗ ▘\n" +
                    "▗ ▖▝ ▝ ▖▝▗▝  ▖  ▖ ▖▘  ▖▗ ▘▗▝ ▝  ▖▘ ▗ ▗ ▖ ▗ ▝ ▗▗▗▝ \n" +
                    " ▖▗ ▘▝ ▗ ▖  ▘ ▝  ▖   ▘   ▖  ▗ ▗   ▖ ▝ ▗ ▘ ▖ ▘▗  ▖ \n" +
                    "▗ ▖ ▘▖▘   ▝ ▖▝ ▝   ▘▖▗▝ ▘  ▘ ▗ ▗▝  ▘▖▝ ▗ ▘ ▘▝  ▘▗ \n" +
                    " ▖ ▘   ▘▝ ▖▘ ▗ ▖ ▘▗     ▖ ▘▗▝     ▘  ▖▗ ▖ ▘ ▘ ▘▝  \n" +
                    " ▖▘▝ ▘▝ ▖▘  ▖  ▗ ▖ ▗▝ ▝  ▗    ▝  ▘ ▝   ▗ ▝ ▘ ▘▝▗▝ \n" +
                    "  ▖▗ ▝ ▖  ▗  ▖▘   ▗  ▗ ▖▘  ▘▗▝  ▘ ▗ ▗▝  ▗ ▖▝ ▘▝   \n" +
                    "▝▗ ▖▝ ▖ ▗▝  ▘  ▖▘▝  ▖    ▖▘    ▖ ▗     ▘   ▖▝ ▖ ▘ \n" +
                    "▗ ▖▗▗ ▖▝ ▗ ▘▖ ▘ ▗ ▖▘  ▘▗  ▗▝ ▖▘ ▗ ▗▝ ▝▗ ▘▝ ▗ ▘ ▘▝ \n" +
                    "▖▚▐▗▗▚▐▐▝▖▘▚ ▚▝▗ ▖ ▖▝ ▖ ▖▘  ▖  ▖▗ ▖▗▝▗▗▝▗▘▞▗▝▖▘▘▚ \n" +
                    "▐▝▖▌▚▚▚▚▚▚▚▘▚▗▘▖▘ ▘▗ ▘ ▘ ▖▘▖▗▝ ▖▗▗▗▗▝▖▚▐▗▚▞▞▞▞▞▜▖▌\n" +
                    "▗▝▗▝▗▘▖▚▐▝▖▛▞▖▌▞▞▝▞▗▝ ▘▝▗ ▖▗ ▝▗ ▘▖▖▚▚▐▐▐▐▚▚▚▌▛▞▚▝ \n" +
                    " ▖▗▗▗▝▗▘▖▘▚▝▞▐▐▐▝▌▞▖▞▝▝▗ ▖▗ ▝▝ ▚▚▐▐▐▐▐▐▐▐▐▐▝▞▖▚▘▞ \n" +
                    "▞▖▌▞▖▌▌▞▄▌▘▚▝▖▚▝▚▚▚▝▖▘▝  ▖ ▝▝▝▐▗▚▚▚▚▚▘▌▚▐▄▙▜▐▀▘▌▚▀\n" +
                    "▟▟▜▟▜▟▜▟▄▀▛▙▚▞▖▚▚▝▞▞▖▘▘ ▘ ▝▗▝▝▖▌▌▌▚▘▌▌▞▙▜▝▖▌▙▛▛▟▙█\n" +
                    "▜▜▜▄▖▞▙▌▙▀▞▞▞▞▞▖▖▚▗▝▖▚▝  ▗ ▖▗▚▐▗▘▞▐▐▝▞▚▚▚▚▀▟▚▌▘▖▙█\n" +
                    "▜▜▜▟▛▛▞▞▞▗ ▚▚▚▖▞ ▘▖▘▞ ▖▝   ▖▗ ▘▖▘▞▗ ▞▖▌▌▘▘▝▞▚▜▙▙▙▜\n" +
                    "▀▙▚▞▟▚▚▚▘▖▝▖▗▘▞ ▝ ▖▘▖▘ ▖▝ ▘▗ ▚▘▖▘▗ ▝▖▘▚ ▘▝ ▜▖▌▙▚▌█\n" +
                    "▝▖▀▞▞▞▝▖▖▖▘ ▘  ▝ ▘▗▗ ▘▘ ▖▗▗ ▚▗▗ ▚▗▝  ▘ ▘▘▘▘▖▐▐▐▚▙▀\n" +
                    "▚▝▞▗▗ ▘▖▗▗▝▝ ▝ ▖▘▝▗ ▚▘▞ ▖ ▖▝▗▗▘▞ ▖▗ ▘ ▘▝▗▘▖▖▖▖▖▖▗ \n" +
                    "▖▚▗▘▖▘▘▖▖▗ ▖▘ ▘ ▝▗▗▘▘▖▖▖▗ ▖▘▚▗▗ ▚▗▗ ▖▘▝▗ ▖▖▖▖▖▖▝▖▘\n" +
                    "▝▗ ▖▝▝▗ ▖ ▖ ▖▘ ▘▘▖▖▘▚▗ ▖▗ ▖▚▗▘▖▘▘▗ ▖▖ ▘ ▖   ▗ ▝▗ ▘\n" +
                    "▗ ▖ ▘▖▗ ▗ ▖▗  ▘▝▖▖▞▐▗▗▗ ▖▗▗▗▗▚▝▞▝▖▝ ▖▘▝ ▖▘▘▝  ▘▗▝ \n" +
                    " ▖ ▘▖▗ ▝ ▖▗  ▚▝▖▖▞▗▘▖▖▗    ▖▖▖▚▗▘▞▝▖▖▝ ▘ ▖▝▗▝▗▝   \n" +
                    " ▖▘▖▗ ▝ ▘ ▗ ▘▖▖▖▖▖▚▝▗▗ ▖▘▝▗▗▝▝▖▚▝▗▘▖▝▝▝▗ ▖▘ ▖▗ ▖▘ \n" +
                    "▗ ▖▖▗▝ ▘ ▘ ▖▘▖▖▞▗▝▖▘▘▖▖  ▝ ▗▝▖▞▖▘▚▝▝▝▝▗ ▖ ▖▘ ▖▗ ▝ \n" +
                    " ▗ ▗ ▗▝ ▘▝▗ ▖▖▞ ▘▚▝▞▝ ▗▝ ▖▝ ▖▖▖▞▝▖▘▚▘▚ ▘▖▘ ▖▘ ▖▝▗ \n" +
                    "▗ ▖ ▖ ▖▗ ▘ ▖▖▖▞▝▞▖▚▝▝▝    ▖▘▖▞▖▞▝▖▚▘▞ ▘▘ ▖▘ ▖▘ ▖  \n" +
                    " ▗ ▘ ▘ ▖ ▘▖▖▖▘▖▚▗▝▖▚▘▘▘▝ ▖ ▖▖▖▞▝▞▗▚▗▗▘▘▞▗ ▖▘ ▖▘ ▘ \n" +
                    "▝ ▖▝ █████▙█▟████████████▟██▟███████▙███▙████▖ ▘▝ \n" +
                    " ▘ ▖▘█▜█▀██▀███▀▀▜▛▜█▀█▀▀▀▜▛▀▀▜▛▀█▀▀██▀██▀█▛▜▖▘▝ ▖\n" +
                    "▝ ▘ ▖▙ ▀▘▟▛▗ █▌▐█▄█▝▘▐█ ▀▀█▌▐▀▗▙ ▟▚ █▘▄▐█ ▝▌▐▖ ▘▗ \n" +
                    "▗▝ ▘ ▙▝█▌▐▗▟▖▀▌▐▀▀▙▗▙▞▜ ▛▛█▘▟▖▜▌▐ ▐▗▛▗▄▖▜ ▙▖▐▘▝ ▖ \n" +
                    " ▗▗ ▘██████████████▟████▟█▟███▙████▙████████▟▌▝ ▗ \n" +
                    "▗  ▖▝▀▀▀▀▀▀▀▀▛▜▜▀▛▜▀▛▀▀▀▀▀▜▀▀▛▜▜▜▜▜▜▜▜▀▀▀▜▀▜▀▘▖▘▖ \n" +
                    "  ▘   ▝ ▝ ▘▝ ▝  ▘▝ ▝ ▝ ▝ ▘ ▝ ▝ ▘ ▘▝ ▝ ▘▘▘    ▘  ▝ \n" +
                    "-->", 3);
            log("What language would you like to use?", 50);
            log("Java, Javascript, Python?", 50);
            String language = handleInput(new String[]{"C", "C++", "Java", "Javascript", "Python"});
            if (language.equalsIgnoreCase("C") || language.equalsIgnoreCase("C++")) {
                log("You think you're better than us!?", 50);
            } else if (language.equalsIgnoreCase("javascript") || language.equalsIgnoreCase("python")) {
                log("Really? You think that's going to work?", 50);
                log("* imposter syndrome sets in *", 50);
            } else {
                log("Good choice my friend.", 50);
            }

            sleep(1000);
            log("*HACKiNG SOUNDS*", 50);
            log("*HACKiNG SOUNDS*", 50);
            log("*HACKiNG SOUNDS*", 50);

        } else {
            log("You chose to fight the virus the old fashioned way...", 25);
            log("Why?", 50);
            SCANNER.nextLine();
            SCANNER.nextLine();
            log("Okay, but I just don't get it, it's a computer virus...", 25);
            sleep(2000);
            log("It just doesn't make sense to me.", 50);
            log("* DEEP SIGH *", 50);
            sleep(2000);
            if (playerStrength > 50) {
                log("Well, you're pretty strong, so you have that going for you", 50);
            }
            log("Your probability of winning is " + probability + "/100", 50);
            sleep(2000);
            log("Whelp, here goes...", 50);
            log("* " + playerName + " hits the virus with a sword *", 50);
            sleep(500);
            log("* they hit it again *", 50);
            sleep(1000);
            log("...", 50);
            sleep(1000);
        }
        playerHealth -= randomBetween(0, 25);

        if (probability >= 50 && playerHealth > 0) {
            log("Oh my! You actually did it.", 50);
            log("You defeated the virus...", 50);
            log("You lost some health along the way", 50);
            sleep(2000);
            log("And you did it in a way that m̶͔̺̀͌̓a̴̖̺̠͚̜͆̈́̆̚k̴̤̳͕͕̠̈́̂e̵̹̻͋̀̋ş̴̝͖̖̊̿̕͠ no sense whatsoever...", 50);
            sleep(2000);
            log("Wait, what was that...", 50);
            log("Oh no, a new virus has emerged", 50);
            fightVirus();
        } else if (playerHealth < 0 && probability >= 50) {
            log("Oh my! You actually did it.", 50);
            log("You defeated the virus...", 50);
            log("You lost some health along the way", 50);
            sleep(2000);
            log("Oh like all of your health.", 50);
            log("Yeah, you're dead.. sorry", 50);
            sleep(3000);
            initPlayer();
        } else {
            log("Yeah, you lost...", 50);
            sleep(2000);
            log("Hello?", 50);
            sleep(2000);
            log("Oh yeah, I forgot...", 50);
            initPlayer();
        }
    }

    static int calcProbability(int bias) {
        return (randomBetween(0, 100)) + bias;
    }

    static void loadMetaverse() {
        for (int i = 0; i < 50; i++) {
            System.out.print(i == 48 ? "\u001B[32m" : "" + "Loading Metaverse: [" + "#".repeat(i) + "]" + "\r");
            sleep(75);
        }
        System.out.print("\n");
        System.out.println("\u001B[0m");

    }

    static void showHealthBar() {
        int healthBars = playerHealth / 2;
        log("\u001B[31m" + "Health: [" + "=".repeat(healthBars) + " ".repeat(50 - healthBars) + "]" + "\u001B[0m", 10);
    }

    static void showStats() {
        String strengthDisplay = "### STRENGTH: " + playerStrength + "/100 ###";
        String intelligenceDisplay = "### INTELLIGENCE: " + playerIntelligence + "/100 ###";
        showHealthBar();
        log("#".repeat(intelligenceDisplay.length()), 5);
        log(strengthDisplay, 5);
        log(intelligenceDisplay, 5);
        log("#".repeat(intelligenceDisplay.length()), 5);

    }

    static String handleInput(String[] allowedInputs) {
        String input = "";
        boolean inputAllowed = false;
        while (!inputAllowed) {
            input = SCANNER.next().trim();
            for (String allowedInput : allowedInputs) {
                if (input.equalsIgnoreCase(allowedInput)) {
                    inputAllowed = true;
                    break;
                }
            }
            if (inputAllowed) break;
            else System.err.println("Input not allowed...");
        }
        return input;
    }

    static void log(String message, int delayinMs) {
        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i));
            if (delayinMs != 0) sleep(delayinMs);
        }
        System.out.print("\n");
        sleep(500);
    }


    static void sleep(int m) {
        try {
            TimeUnit.MILLISECONDS.sleep(m);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }

    static int randomBetween(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }


}
