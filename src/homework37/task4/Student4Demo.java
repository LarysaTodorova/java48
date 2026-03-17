package homework37.task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Student4Demo {
    public static void main(String[] args) {
        /*
    В списке студентов - выбрать тех трех кто имеет самые высокие оценки и отсортировать по году поступления
     */

        List<StudentTask4> students = new ArrayList<>();

        students.add(new StudentTask4("Leo", 5, 2022));
        students.add(new StudentTask4("Andrea", 4, 2023));
        students.add(new StudentTask4("Max", 4, 2024));
        students.add(new StudentTask4("Robert", 5, 2021));
        students.add(new StudentTask4("Marya", 4, 2022));


        List<StudentTask4> sortedStudents = students.stream()
                .sorted(Comparator.comparingInt(StudentTask4::getGrade).reversed())
                .limit(3)
                .sorted((s1, s2) -> s1.getYearOfAdmission() - s2.getYearOfAdmission())
                .toList();

        System.out.println(sortedStudents);
    }

}

