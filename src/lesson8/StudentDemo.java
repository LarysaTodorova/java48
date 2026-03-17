package lesson8;

public class StudentDemo {
    public static void main(String[] args) {

        StudentManager myStudentManager = new StudentManager();

        Student student1 = myStudentManager.createStudents();

        System.out.println(student1);


    }

}
