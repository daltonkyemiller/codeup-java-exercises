import java.util.Locale;
import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Hi, I am bob. How are you?");
            String userResponse = s.nextLine().trim();
            String bobResponse = "Bob: ";

            if (userResponse.equals("")) bobResponse += "Fine. Be that way!";
            else if (userResponse.endsWith("?")) bobResponse += "Sure.";
            else if (userResponse.endsWith("!")) bobResponse += "Whoa, chill out!";
            else bobResponse += "Whatever.";

            System.out.println(bobResponse);
            System.out.println("Would you like to keep talking to Bob? [y/N]");
            String userYN = s.nextLine();
            if (!userYN.equalsIgnoreCase("y")) break;

        }

    }
}
