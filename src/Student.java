import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    private HashMap<String, String> attendence;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public void recordAttendance(String date, String value) {
        if (!value.equalsIgnoreCase("a") || !value.equalsIgnoreCase("p")) return;
        attendence.put(date, value);
    }

    public double calcAttendence() {
        int absences = 0;
        int totalDays = attendence.size();
        for (String val : attendence.values()) {
            if (val.equalsIgnoreCase("a")) absences++;
        }
        return (double) absences / totalDays;
    }

    public double getGradeAverage() {
        double totalGrades = 0;
        for (Integer grade : this.grades) {
            totalGrades += grade;
        }
        return totalGrades / this.grades.size();
    }
}
