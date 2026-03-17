package lesson27ArrayList.company;

import java.util.ArrayList;

public class CompanyDemo {
    public static void main(String[] args) {

        //создаем репозитории
        DepartmentRepository departmentRepository = new DepartmentRepository();
        EmployerRepository employerRepository = new EmployerRepository();

        //добавляем отделы
        Department department1 = new Department("IT");
        Department department2 = new Department("Management");
        Department department3 = new Department("HR");

        departmentRepository.addDepartment(department1);
        departmentRepository.addDepartment(department2);
        departmentRepository.addDepartment(department3);


       //добавляем сотрудников
        Employer employer1 = new Employer("Alex",10, department1);
        Employer employer2 = new Employer("Ludwig",11, department2);
        Employer employer3 = new Employer("Mary",12, department1);
        Employer employer4 = new Employer("Robert",13, department3);

        employerRepository.addEmployer(employer1);
        employerRepository.addEmployer(employer2);
        employerRepository.addEmployer(employer3);
        employerRepository.addEmployer(employer4);

        //находим всех сотрудников компании
        ArrayList<Employer> allEmployers = employerRepository.getAllEmployers();
        System.out.println("All employers off company: ");
        for (Employer carrentEmployer : allEmployers) {
            System.out.println(carrentEmployer);

        }


        //находим сотрудников в отделе IT
        ArrayList<Employer> itEmployer = employerRepository.findByDepartment("IT");
        System.out.println("Employers from IT department: ");
        for (Employer itEmp : itEmployer) {
            System.out.println(itEmp);

        }


        //находим сотрудника в отделе HR
        ArrayList<Employer> hrEmployer = employerRepository.findByDepartment("HR");
        System.out.println("All employers from HR department: ");
        for (Employer hrEmp : hrEmployer) {
            System.out.println(hrEmp);
        }
    }

}
