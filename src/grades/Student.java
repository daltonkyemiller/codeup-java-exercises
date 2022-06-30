package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    private HashMap<String, String> attendence;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendence = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public void recordAttendance(String date, String value) {
        if (!value.equalsIgnoreCase("a") && !value.equalsIgnoreCase("p")) return;
        attendence.put(date, value);
    }

    public double calcAttendance() {
        double absences = 0;
        double totalDays = attendence.size();
        for (String val : attendence.values()) {
            if (val.equalsIgnoreCase("a")) absences++;
        }
        return (totalDays - absences) / totalDays * 100;
    }

    public double getGradeAverage() {
        double totalGrades = 0;
        for (Integer grade : this.grades) {
            totalGrades += grade;
        }
        return totalGrades / this.grades.size();
    }
}
