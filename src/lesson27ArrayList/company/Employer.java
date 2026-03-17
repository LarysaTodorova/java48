package lesson27ArrayList.company;

public class Employer {
    private String name;
    private int id;
    private Department department;

    public Employer(String name, int id, Department department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", department=" + department +
                '}';
    }
}
