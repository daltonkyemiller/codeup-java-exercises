import java.util.InputMismatchException;
import java.util.Scanner;

public class HighLow {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        startGame();
    }

    static void startGame() {
        int randomNum = genRandomNum();
        System.out.println("I have generated a random number between 1 and 100, try to guess it");
        while (true) {
            int userGuess = getUserGuess();

            if (userGuess == randomNum) {
                System.out.println("YOU WON!!!");
                System.out.println("Would you like to play again? [y/N]");
                s.nextLine();
                String userContine = s.nextLine();

                if (!userContine.equalsIgnoreCase("n")) startGame();
            }

            if (userGuess < randomNum) {
                System.out.println("HIGHER");
            } else {
                System.out.println("LOWER!");
            }
        }
    }

    static int getUserGuess() {
        String input = s.next();
        int result = 0;
        try {
            result = Integer.parseInt(input);
            if (result < 1 || result > 100) throw new Exception();
        } catch (Exception e) {
            System.err.println("Sorry, that's not a valid answer, and you know it. Try again.");
            getUserGuess();
        }
        return result;
    }

    static int genRandomNum() {
        return (int) (Math.random() * 100);
    }
}
