package lesson28LinkedList;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository {
    private List<Teacher> teacherList = new ArrayList<>();

public void AddTeacher(Teacher teacher) {
    teacherList.add(teacher);
}

public void printAllTeachers(List<Teacher> teachers) {
    System.out.println(teachers);
}

}
