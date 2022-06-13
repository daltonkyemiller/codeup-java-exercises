import java.util.Scanner;

public class MethodsExercises {
    static Scanner s = new Scanner(System.in);

    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        int sum = 0;
        for (int i = 0; i < y; i++) {
            sum += x;
        }
        return sum;
    }

    public static double divide(int x, int y) {
        return (double) x / y;
    }

    public static int getInteger(int in, int min, int max) {
        if (in > min && in < max) return in;
        else {
            System.err.println("Nope.");
            return getInteger(in, min, max);
        }
    }

    public static long calcFactorial(int num) {
        long result = 1;
        for (long i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static int calculateHighestFactorial() {
        int tester = 0;
        long cache = 1;
        while (cache > 0) {
            tester++;
            cache = calcFactorial(tester);
            if (cache <= 0) {
                tester--;
            }
        }
        return tester;
    }


    public static int diceRoll(int sides) {
        return (int) (Math.random() * sides) + 1;
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        System.out.println(add(x, y));
        System.out.println(subtract(x, y));
        System.out.println(multiply(x, y));
        System.out.println(divide(x, y));

        System.out.println("-------------------");

        int min = 5;
        int max = 10;
        System.out.printf("Enter a number between %s and %s \n", min, max);
        int numToTest = s.nextInt();
        getInteger(numToTest, min, max);

        System.out.println("-------------------");


        int highestFactorial = calculateHighestFactorial();
        while (true) {
            System.out.printf("Enter a number to be facotorial'd between 1 & %s.\n", highestFactorial);
            int numToBeFactorialed = s.nextInt();
            if (numToBeFactorialed < 1 || numToBeFactorialed > highestFactorial) continue;
            System.out.println(calcFactorial(numToBeFactorialed));
            System.out.println("Would you like to continue? [y/N]");
            s.nextLine();
            String answer = s.nextLine();
            if (!answer.equalsIgnoreCase("y")) break;
        }

        System.out.println("-------------------");
        while (true) {
            System.out.println("How many sides does the dice have?");
            int numOfDiceSides = s.nextInt();
            if (numOfDiceSides < 1) continue;
            int diceOne = diceRoll(numOfDiceSides);
            int diceTwo = diceRoll(numOfDiceSides);
            System.out.printf("Die #1 is %s die #2 is %s\n", diceOne, diceTwo);
            System.out.println("Do you want to roll again? [y/N]");
            s.nextLine();
            String userTryAgain = s.nextLine();
            if (!userTryAgain.equalsIgnoreCase("y")) break;

        }
    }

}
