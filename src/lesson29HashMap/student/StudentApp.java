package lesson29HashMap.student;

import java.util.ArrayList;
import java.util.List;

public class StudentApp {
    public static void main(String[] args) {

        Student student1 = new Student("Alexa");
        student1.add("Math", 5);
        student1.add("Logic", 4);
        student1.add("English", 5);
        student1.add("Philosophy", 3);

        Student student2 = new Student("Oliver");
        student2.add("Math", 4);
        student2.add("Logic", 5);
        student2.add("English", 4);
        student2.add("Philosophy", 4);

        student1.printInfo();
        student2.printInfo();
        System.out.println("======================");

        //================================

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        for (Student student : students) {
            student.printInfo();
        }

    }
}
