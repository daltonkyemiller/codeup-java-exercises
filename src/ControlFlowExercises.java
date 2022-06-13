import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n----------");

        long x = 2;
        do {
            System.out.println(x);
            x *= x;
        } while (x < 1000000);

        System.out.println("----------");
        int greatVariableName = 100;
        do {
            System.out.println(greatVariableName);
            greatVariableName -= 5;
        } while (greatVariableName >= -10);

        System.out.println("----------");

        for (int j = 5; j <= 15; j++) {
            System.out.println(j);
        }
        System.out.println("----------");

        for (long j = 2; j < 1000000; j *= j) {
            System.out.println(j);
        }

        System.out.println("----------");

        for (int j = 0; j < 100; j++) {
            String result = "";
            if (j % 15 == 1) result = "FizzBuzz";
            else if (j % 5 == 1) result = "Buzz";
            else if (j % 3 == 1) result = "Fizz";
            else result = String.valueOf(j);
            System.out.println(result);
        }
        System.out.println("----------");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter an integer");
            int userInt = scanner.nextInt();
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (long j = 1; j <= userInt; j++) {
                System.out.printf("%s      | %s       | %s\n", j, j * j, j * j * j);
            }

            System.out.println("Would you like to continue? (y/n)");
            String cont = scanner.next();
            if (cont.equals("n")) break;
        }

        System.out.println("Enter a grade from 0-100");
        int numberGrade = scanner.nextInt();
        String letterGrade = "A";
        if (numberGrade <= 100) letterGrade = "A";
        if (numberGrade < 90) letterGrade = "B";
        if (numberGrade < 80) letterGrade = "C";
        if (numberGrade < 70) letterGrade = "D";
        if (numberGrade < 60) letterGrade = "F";
        if (numberGrade % 10 > 6) letterGrade += "+";
        if (numberGrade % 10 < 3) letterGrade += "-";
        System.out.println(letterGrade);


    }

}
