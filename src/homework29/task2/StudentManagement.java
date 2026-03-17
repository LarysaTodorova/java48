package homework29.task2;

import java.util.HashMap;
import java.util.Map;

public class StudentManagement {

    private Map<Integer, Student> students;

    public StudentManagement() {
        this.students = new HashMap<>();
    }


    public void addStudent(int id, String name) {
        if (students.containsKey(id)) {
            System.out.println("We have the same student");
        }else {
            students.put(id, new Student(id, name));
        }
    }

    public void addGrade(int id, String subject, int grade) {
       Student student = students.get(id);
       if (student != null) {
           student.addGrade(subject, grade);
       }else {
           System.out.println("Student with id " + id + " is not found. ");
       }
    }

    public Student getStudent(int id) {
        return students.get(id);
    }

    public double getAverageGrade(int id) {
        Student student = students.get(id);
        if (student != null) {
            return student.getAverageGrade();
        }else {
            System.out.println("Student with id: " + id + " is not found");
        }
       return 0;
    }
}
