package lesson28LinkedList;

import java.util.List;

public class Cours {
    private int id;
    private String coursName;
    private Teacher teacher;
    private List<Student> studentList;

    public Cours(int id, String coursName, Teacher teacher) {
        this.id = id;
        this.coursName = coursName;
        this.teacher = teacher;

    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public String getCoursName() {
        return coursName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        return "Cours{" +
                "id=" + id +
                ", coursName='" + coursName + '\'' +
                ", teacher=" + teacher +
                ", studentList=" + studentList +
                '}';
    }
}
