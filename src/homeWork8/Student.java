package homeWork8;

public class Student {
    private String surname;
    private String name;
    private int studentID;
    private Group groupInfo;

    public Student(String surname, String name, int studentID, Group groupInfo) {
        this.surname = surname;
        this.name = name;
        this.studentID = studentID;
        this.groupInfo = groupInfo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", studentID=" + studentID +
                ", groupInfo=" + groupInfo +
                '}';
    }
}
