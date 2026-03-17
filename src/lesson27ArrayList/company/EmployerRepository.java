package lesson27ArrayList.company;

import java.util.ArrayList;

public class EmployerRepository {

    private ArrayList<Employer> employers = new ArrayList<>();

    //метод для добавления нового сотрудника
    public void addEmployer(Employer employer) {
        employers.add(employer);
    }

    //метод для поиска всех сотрудников в отделе
    public ArrayList<Employer> findByDepartment(String departmentName) {
        ArrayList<Employer> employersByDepartment = new ArrayList<>();
        for (Employer employer : employers) {
            if (employer.getDepartment().getName().equals(departmentName)) {
               employersByDepartment.add(employer);
            }

        }
        return employersByDepartment;
    }

    //метод для получения всех сотрудников
    public ArrayList<Employer> getAllEmployers() {
        return employers;
    }

}

