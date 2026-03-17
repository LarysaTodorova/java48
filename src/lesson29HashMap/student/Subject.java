package lesson29HashMap.student;

public class Subject {
    private String subjectName;
    private Integer grade;

    public Subject(String subjectName, Integer grade) {
        this.subjectName = subjectName;
        this.grade = grade;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public Integer getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
