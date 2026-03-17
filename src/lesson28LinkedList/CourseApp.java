package lesson28LinkedList;

import java.util.ArrayList;
import java.util.List;

public class CourseApp {
    public static void main(String[] args) {

        StudentRepository studentRepository = new StudentRepository();
        TeacherRepository teacherRepository = new TeacherRepository();
        CoursRepository coursRepository = new CoursRepository();

        Student student1 = new Student(01,"Alex");
        Student student2 = new Student(02,"Alexa");
        Student student3 = new Student(03,"Olivia");
        Student student4 = new Student(04,"Ludwig");
        Student student5 = new Student(05,"Fabian");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        Teacher teacher1 = new Teacher("Anna", 01);
        Teacher teacher2 = new Teacher("Martin", 02);
        Teacher teacher3 = new Teacher("Mary", 03);

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);

        Cours cours1 = new Cours(01, "Math",teacher1);
        Cours cours2 = new Cours(02, "English",teacher2);
        Cours cours3 = new Cours(03, "Logic",teacher1);
        Cours cours4 = new Cours(04, "Sport",teacher3);

        List<Cours> courses = new ArrayList<>();
        courses.add(cours1);
        courses.add(cours2);
        courses.add(cours3);
        courses.add(cours4);




    }
}
