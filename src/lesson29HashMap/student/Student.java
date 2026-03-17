package lesson29HashMap.student;

import java.util.ArrayList;
import java.util.List;

public class Student {
private String studentName;
private List<Subject> subjects;

    public Student(String studentName) {
        this.studentName = studentName;
        subjects = new ArrayList<>();
    }

    public void add(String subject, Integer grade) {
        //необходимо предварительно провести рповерку,
        // что такого предмета еще нет для этого студента
        //если есть - то надо не добавлять новый элемент в "List"
        //а найти там нужный и заменить там оценку на новую

        subjects.add(new Subject(subject,grade));
    }

    public void printInfo() {
        System.out.println("Student name: " + studentName);
        for (Subject subject : subjects) {
            System.out.println("Subject: " + subject.getSubjectName() + ", year grade: " + subject.getGrade());
        }
    }
}
