package consultation8;

public class Student {

    private int studentId;
    private String studentName;
    private int groupNumber;

    public Student(int studentId, String studentName, int groupNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.groupNumber = groupNumber;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
