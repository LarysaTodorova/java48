package homeworkProject.task2;

public class Student {

    private String name;
    private String surname;
    private int yearOfBirth;
    private String group;
    private int id;

    public Student(String name, String surname, int yearOfBirth, String group,int id) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.group = group;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearOfBirthOfBirth() {
        return yearOfBirth;
    }

    public String getGroup() {
        return group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", ageOfBirth=" + yearOfBirth +
                ", group='" + group + '\'' +
                ", id=" + id +
                '}';
    }
}