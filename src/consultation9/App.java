package consultation9;

public class App {
    public static void main(String[] args) {

        EmployeeService employeeService = new EmployeeService(10);

        //Пример добавляем одного сотрудника
        ContractedEmployee employee = new ContractedEmployee("Alex", "999", "Developer", 160, 5500);

        //Добавляем записи о рабочих часах
        employeeService.addWorkingHours("999", new WorkingHoursRecord("2024-07-15", 8, "9:00", "17:00") ,0);
        employeeService.addWorkingHours("999", new WorkingHoursRecord("2024-07-16", 10, "08:00", "18:00" ),1);


        //Отображаем информацию о всех сотрудниках
        employeeService.displayAllEmployeesInfo();

    }
}
