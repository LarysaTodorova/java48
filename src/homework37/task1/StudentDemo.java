package homework37.task1;

import java.util.ArrayList;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {

        //Фильтрация списка студентов по возрасту и баллу больше 4,5

        List<Student> students = new ArrayList<>();

        students.add(new Student("Alex", 23, 5.5));
        students.add(new Student("Alexa", 27, 4.7));
        students.add(new Student("Olivia", 25, 3.9));
        students.add(new Student("Marcus", 29, 4.5));
        students.add(new Student("Anna", 28, 4.8));

        List<Student> filteredStudents = students.stream()
                .filter(student -> student.getAge() > 25 && student.getAvgGrade() > 4.5)
                .toList();

        System.out.println("Result of filtering: " + filteredStudents);



    }
}
