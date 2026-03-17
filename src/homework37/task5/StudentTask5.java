package homework37.task5;

public class StudentTask5 {
    private String name;
    private int yearOfAdmission;

    public StudentTask5(String name, int yearOfAdmission) {
        this.name = name;
        this.yearOfAdmission = yearOfAdmission;
    }

    public String getName() {
        return name;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    @Override
    public String toString() {
        return "StudentTask5{" +
                "name='" + name + '\'' +
                ", yearOfAdmission=" + yearOfAdmission +
                '}';
    }
}
