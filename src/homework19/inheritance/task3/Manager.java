package homework19.inheritance.task3;

public class Manager extends Employee{

    private Employee[] employee;

    public Manager(String name, int ID, String position, Employee[] employee) {
        super(name, ID, position);
        this.employee = employee;
    }
}
