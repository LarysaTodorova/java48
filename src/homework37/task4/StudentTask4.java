package homework37.task4;

public class StudentTask4 {

    private String name;
    private int grade;
    private int yearOfAdmission;

    public StudentTask4(String name, int grade, int yearOfAdmission) {
        this.name = name;
        this.grade = grade;
        this.yearOfAdmission = yearOfAdmission;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    @Override
    public String toString() {
        return "StudentTask4{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", yearOfAdmission=" + yearOfAdmission +
                '}';
    }
}
