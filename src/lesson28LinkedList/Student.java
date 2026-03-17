package lesson28LinkedList;

import java.util.List;

public class Student {
    private int studentId;
    private String studentName;
    private List<Cours> coursStudent;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

    }

    public void setCoursStudent(List<Cours> coursStudent) {
        this.coursStudent = coursStudent;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public List<Cours> getCoursStudent() {
        return coursStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", coursStudent=" +  +
                '}';
    }
}
