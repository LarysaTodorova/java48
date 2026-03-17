package homework40.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDemo {
    public static void main(String[] args) {

        /*
        Задача 2: Группировка элементов и подсчёт количества

Задание: Дан список объектов сотрудников (Employee), где каждый объект содержит имя и отдел, в котором работает сотрудник.
 Необходимо сгруппировать сотрудников по отделам и подсчитать количество сотрудников в каждом отделе.
         */

        Employee employee1 = new Employee("Alexa","IT");
        Employee employee2 = new Employee("Robert","IT");
        Employee employee3 = new Employee("Oliver","Marketing");
        Employee employee4 = new Employee("Anna","Marketing");
        Employee employee5 = new Employee("Frank","IT");


        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);


        Map<String,Long> sortedEmployees = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        sortedEmployees.forEach((position,employee) ->
                System.out.println("Position: " + position + " ; employees: " + employee));




    }
}
