package consultation9;

public class EmployeeService {

    private ContractedEmployee[] employees;
    private int employeeCount;

public EmployeeService(int maxEmployees) {
    employees = new ContractedEmployee[maxEmployees];
    employeeCount = 0;

}

public void addEmployee(ContractedEmployee employee) {
    if (employeeCount < employees.length) {
        employees[employeeCount++] = employee;
    }else {
        System.out.println("Невозможно добавить сотрудника: достигнуто максимальное количество сотрудников.");
    }

}
public void addWorkingHours(String personalCode, WorkingHoursRecord record, int dayIndex) {
    ContractedEmployee employee = findEmployeeByPersonalCode(personalCode);
    if (employee != null) {
        employee.addWorkingHoursRecord(record, dayIndex);
    }else {
        System.out.println("Сотрудник не найден.");
    }
}

public void displayAllEmployeesInfo() {
    for (int i = 0; i < employeeCount; i++) {
        employees[i].displayEmployeeInfo();
        
    }
}

private ContractedEmployee findEmployeeByPersonalCode(String personalCode) {
    for (int i = 0; i < employeeCount; i++) {
        if (employees[i].personalCode.equals(personalCode)) {
            return employees[i];
        }

    }
    return null;
}

}
