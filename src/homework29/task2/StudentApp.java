package homework29.task2;

public class StudentApp {
    public static void main(String[] args) {

        StudentManagement management = new StudentManagement();

        management.addStudent(1, "Alex");
        management.addStudent(2, "Alexa");
        management.addStudent(3, "Robert");
        management.addStudent(4, "Oliver");

        management.addGrade(1,"Math", 5);
        management.addGrade(1, "History", 4);
        management.addGrade(1, "English", 4);

        management.addGrade(2,"Math",4 );
        management.addGrade(2, "History", 5);
        management.addGrade(2, "English", 4);

        management.addGrade(3,"Math", 4);
        management.addGrade(3, "History", 4);
        management.addGrade(3, "English", 4);

        management.addGrade(4,"Math", 5);
        management.addGrade(4, "History", 5);
        management.addGrade(4, "English", 5);

        Student student = management.getStudent(2);
        if (student != null) {
            System.out.println("Student: " + student.getStudentName());
            System.out.println("Average score: " + management.getAverageGrade(2));
        }








    }
}
