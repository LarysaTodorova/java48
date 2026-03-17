package lesson28LinkedList;

import java.util.List;

public class Teacher {
    private int id;
    private String teacherName;
    private List<Cours> teacherCours;

    public Teacher( String teacherName, int id) {
        this.teacherName = teacherName;
        this.id = id;
    }


    public void setTeacherCours(List<Cours> teacherCours) {
        this.teacherCours = teacherCours;
    }

    public int getId() {
        return id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public List<Cours> getTeacherCours() {
        return teacherCours;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", teacherName='" + teacherName + '\'' +
                ", teacherCours=" +  +
                '}';
    }
}
