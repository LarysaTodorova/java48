package lesson29HashMap.studentVar2;

import java.util.HashMap;
import java.util.Map;

public class StudentGrade {

    Map<String, Map<String, Integer>> studentGrade;

    public StudentGrade() {
        this.studentGrade = new HashMap<>();
    }
    public void addGrade(String studentName, String subject, Integer grade) {

        Map<String, Integer> currentStudentGrade = studentGrade.get(studentName);

        if (currentStudentGrade == null) {
            studentGrade.put(studentName, new HashMap<>());
        }
        studentGrade.get(studentName).put(subject, grade);
    }

    public void getAllGrades(String studentName) {

        Map<String, Integer> currentStudentGrade = studentGrade.get(studentName);

        if (currentStudentGrade == null) {
            System.out.println("Student " + studentName + " is nit faund");
        }else {
            System.out.println("Student " + studentName);
            for (String subject : currentStudentGrade.keySet()) {
                System.out.println("Subject: " + subject + ", grade: " + currentStudentGrade.get(subject));
            }
        }

    }
}
