package homework19.inheritance.task3;

public class Developer extends Employee{

    private String[] projects;

    public Developer(String name, int ID, String position, String[] projects) {
        super(name, ID, position);
        this.projects = projects;
    }
}
