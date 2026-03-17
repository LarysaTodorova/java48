package lesson28LinkedList;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private List<Student> studentList = new ArrayList<>();

public  void addStudent(Student student) {
    studentList.add(student);
}

public void printAll(List<Student> students) {
    System.out.println(students);
}
}
