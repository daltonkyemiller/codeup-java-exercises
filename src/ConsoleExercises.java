import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approx. %.2f\n", pi);

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        
        System.out.println("Enter a number");
        scanner.nextInt();

        System.out.println("Enter three words");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.printf("First word: %s\n", firstWord);
        System.out.printf("Second word: %s\n", secondWord);
        System.out.printf("Third word: %s\n", thirdWord);
        scanner.nextLine();

        System.out.println("Enter a sentence");
        String sentence = scanner.nextLine();
        System.out.println(sentence);

        System.out.println("What's the width of your classroom in feet?");
        double widthOfClassroom = Double.parseDouble(scanner.nextLine());

        System.out.println("What's the length of your classroom in feet?");
        double lengthOfClassroom = Double.parseDouble(scanner.nextLine());

        System.out.println("What's the height of your classroom in feet?");
        double heightOfClassroom = Double.parseDouble(scanner.nextLine());

        System.out.printf("The area of your classroom is: %s\n", (widthOfClassroom * lengthOfClassroom));
        System.out.printf("The perimeter of your classroom is: %s\n", (2 * (widthOfClassroom + lengthOfClassroom)));
        System.out.printf("The volume of your classroom is: %s", (widthOfClassroom * lengthOfClassroom * heightOfClassroom));

    }
}
