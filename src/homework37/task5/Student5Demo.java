package homework37.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student5Demo {
    public static void main(String[] args) {
        /*
        из списка студентов сгруппировать данные по году поступления
         */

        List<StudentTask5> students = new ArrayList<>();

        students.add(new StudentTask5("Student1", 2021));
        students.add(new StudentTask5("Student2", 2022));
        students.add(new StudentTask5("Student3", 2021));
        students.add(new StudentTask5("Student4", 2021));
        students.add(new StudentTask5("Student5", 2022));
        students.add(new StudentTask5("Student6", 2022));
        students.add(new StudentTask5("Student7", 2023));
        students.add(new StudentTask5("Student8", 2023));
        students.add(new StudentTask5("Student9", 2023));
        students.add(new StudentTask5("Student10", 2021));

        Map<Integer, List<StudentTask5>> dataOfAdmission;


        dataOfAdmission = students.stream()
                .collect(Collectors.groupingBy(StudentTask5::getYearOfAdmission));

        System.out.println(dataOfAdmission);
    }
}
