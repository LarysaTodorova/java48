package homeworkProject.task2;

public class StudentApp {
    public static void main(String[] args) {

        StudentService service = new StudentService();
        //service.fillStudentFromUserInput();
        service.fillStudentsArrayFromUserInput();
        service.printStudents();
        service.printSortedStudents();

    }
}
