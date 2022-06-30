package grades;

import util.Input;
import util.RandomDate;

import java.time.LocalDate;
import java.util.*;

public class GradesApplication {
    public static HashMap<String, Student> students = new HashMap<>();

    public static double getClassAverage() {
        double total = 0;
        for (Student student : students.values()) {
            total += student.getGradeAverage();
        }
        return total / students.size();
    }

    public static void main(String[] args) {
        Random r = new Random();
        Input in = new Input();

        Student dalton = new Student("Dalton");

        Student mark = new Student("Mark");

        Student elon = new Student("Elon");

        Student greg = new Student("Greg");


        students.put("daltonkyemiller", dalton);
        students.put("thezucker", mark);
        students.put("leavemeelone", elon);
        students.put("iamgreg_200", greg);

        RandomDate randomDate = new RandomDate(LocalDate.of(1900, 1, 1), LocalDate.of(2022, 12, 31));

        // 10 Random attendance records
        students.forEach((user, student) -> {
            for (int i = 0; i < 10; i++) {
                student.addGrade(r.nextInt(50) + 50);
                student.recordAttendance(randomDate.nextDate().toString(), r.nextInt(100) % 2 == 1 ? "A" : "P");
            }
        });

        System.out.printf("The class average is: %.2f%%\n", getClassAverage());

        do {
            System.out.println("Users: ");
            students.forEach((username, student) -> {
                System.out.printf("| %s |\n", username);
            });
            System.out.println("What user would you like to view?");

            String usernameToFind;
            Student studentToFind;
            while (true) {
                usernameToFind = in.getString();
                studentToFind = students.get(usernameToFind);
                if (studentToFind != null) break;
                System.err.println("Sorry, student not found.");
            }
            System.out.printf("Name: %s - Username: %s\n", studentToFind.getName(), usernameToFind);
            System.out.printf("Current Average: %s\n", studentToFind.getGradeAverage());
            System.out.printf("Current Attendence: %.2f%%\n", studentToFind.calcAttendance());
            System.out.println("Would you like to continue? [y/N]");
        } while (in.yesNo());

    }
}
