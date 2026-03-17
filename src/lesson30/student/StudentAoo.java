package lesson30.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentAoo {
    public static void main(String[] args) {

        Student student1 = new Student("Alex");
        Student student2 = new Student("Alexa");
        Student student3 = new Student("Olivia");
        Student student4 = new Student("Robert");

        student1.addSubject("Math", 5);
        student1.addSubject("English", 4);
        student1.addSubject("History", 5);

        student2.addSubject("Math", 4);
        student2.addSubject("English", 4);
        student2.addSubject("History", 4);

        student3.addSubject("Math", 5);
        student3.addSubject("English", 5);
        student3.addSubject("History", 5);

        student4.addSubject("Math", 5);
        student4.addSubject("English", 4);
        student4.addSubject("History", 4);

        student1.printStudent();
        System.out.println("====================");
        student2.printStudent();
        System.out.println("================");
        student3.printStudent();
        System.out.println("==================");
        student4.printStudent();

    }
}
