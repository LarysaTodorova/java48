package lesson8;

public class Student {

    String surname;
    String name;
    String studentID;
    String group;

    public Student(String surname, String name, String studentID, String group) {
        this.surname = surname;
        this.name = name;
        this.studentID = studentID;
        this.group = group;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", studentID='" + studentID + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
