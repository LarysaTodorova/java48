package lesson27ArrayList.company;

import java.util.ArrayList;

public class DepartmentRepository {
    private ArrayList<Department> departments = new ArrayList<>();

    // метод для добавления нового отдела
    public void addDepartment(Department department) {
        departments.add(department);
    }

    //метод для поиска отдела по названию
    public Department findByName(String name) {
        for (Department department:departments) {
            if (department.getName().equals(name)) {
                return department;
            }
        }
        return null;
    }

    //метод для получения всех отделоа
    public ArrayList<Department> getAllDepartments(){
        return departments;
    }
}
