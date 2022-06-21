import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class GradesApplication {
    public static void main(String[] args) {
        Input in = new Input();

        HashMap<String, Student> students = new HashMap<String, Student>();
        Student dalton = new Student("Dalton");
        dalton.addGrade(100);
        dalton.addGrade(93);
        dalton.addGrade(88);
        dalton.addGrade(98);
        Student mark = new Student("Mark");
        mark.addGrade(95);
        mark.addGrade(84);
        mark.addGrade(78);
        mark.addGrade(100);
        Student elon = new Student("Elon");
        elon.addGrade(95);
        elon.addGrade(91);
        elon.addGrade(99);
        elon.addGrade(100);
        Student greg = new Student("Greg");
        greg.addGrade(53);
        greg.addGrade(26);
        greg.addGrade(60);
        greg.addGrade(15);

        students.put("daltonkyemiller", dalton);
        students.put("thezucker", mark);
        students.put("leavemeelone", elon);
        students.put("iamgreg_200", greg);

        while (true) {
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
            System.out.println("Would you like to continue? [y/N]");
            if (!in.yesNo()) break;
        }

    }
}
