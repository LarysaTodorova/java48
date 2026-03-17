package lesson29HashMap.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompanyDemo {
    public static void main(String[] args) {

        //==== создаем отдел
        Department department1 = new Department("Development");
        Department department2 = new Department("Marketing");

        List<Department> departments= new ArrayList<>();

        departments.add(department1);
        departments.add(department2);

        //===создаем сотрудников
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Olivia"));
        employees.add(new Employee(2, "Oliver"));
        employees.add(new Employee(3, "Alexa"));
        employees.add(new Employee(4, "Anna"));
        employees.add(new Employee(5, "Robert"));

        //====назначить сотрудников в отделы

        List<Employee> employeesForDepartment1 = new ArrayList<>();
        employeesForDepartment1.add(employees.get(2));
        employeesForDepartment1.add(employees.get(0));
        employeesForDepartment1.add(employees.get(4));

        List<Employee> employeesForDepartment2 = new ArrayList<>();
        employeesForDepartment2.add(employees.get(1));
        employeesForDepartment2.add(employees.get(3));

        Map<Department, List<Employee>> company = new HashMap<>();
        company.put(department1, employeesForDepartment1);
        company.put(department2, employeesForDepartment2);

        System.out.println(company);



    }
}
