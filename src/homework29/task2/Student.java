package homework29.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Student {
    private int id;
    private String studentName;
    private Map<String, Integer> grades;

    public Student(Integer id, String studentName) {
        this.id = id;
        this.studentName = studentName;
        this.grades = new HashMap<>();
    }

    public Integer getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void addGrade(String subject, int grade) {
        grades.put(subject, grade);
    }

    public HashMap<String, Integer> getGrades() {
        return (HashMap<String, Integer>) grades;
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0;
        }
        int total = 0;
        for (int grade : grades.values()) {
            total += grade;
        }
        return total / (double) grades.size();
    }

}
