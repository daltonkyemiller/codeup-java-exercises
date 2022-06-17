import java.util.Random;

public class ServerNameGenerator {
    static Random rand = new Random();
    static String[] adjectives = new String[]{"smart", "beautiful", "creative", "talented",
            "hard-working", "terrible", "terrific", "handsome", "jumpy", "crazy"};

    static String[] nouns = new String[]{"cat", "human", "cigarette", "hamburger", "tennis shoes", "coral", "button", "mom"};

    static String randomStringFromArray(String[] arr) {
        return arr[rand.nextInt(arr.length)];
    }

    static String stringToSpinalCase(String str) {
        return str.replace(" ", "-");
    }

    static String generateRandomServerName() {
        return String.format("%s-%s", stringToSpinalCase(randomStringFromArray(adjectives)), stringToSpinalCase(randomStringFromArray(nouns)));
    }

    public static void main(String[] args) {
        System.out.println(generateRandomServerName());
    }
}
