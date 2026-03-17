package homeworkProject.task2;

import lesson5.superCalc.UserInput;

public class StudentService {

    private StudentRepository repository;
    UserInput userInput = new UserInput();

    public StudentService() {
        this.repository = new StudentRepository(3);

    }
    /*
Добавьте метод createStudentFromUserInput для создания
нового объекта Student на основе данных, введенных пользователем.
 */
   public Student  createStudentFromUserInput() {

       System.out.println("Enter an information about student: ");

       String name = userInput.inputText("Name: ");

       String surname = userInput.inputText("Surname: ");

       String group = userInput.inputText("Group: ");

       int yearOfBirth = userInput.inputInteger("Year of birth: ");

       return new Student(name,surname,yearOfBirth,group,0);
   }

   /*
Добавьте метод createStudentsArrayFromUserInput для чтения размера
массива и его создания.
Метод должен возвратить созданный массив как ссылку.
 */
    public Student[] createStudentsArrayFromUserInput() {
       int freSlotsNumber = repository.getFreeSlotsNumber();
       Student[] createStudents = new Student[freSlotsNumber];

        for (int i = 0; i < freSlotsNumber; i++) {
            createStudents[i] = createStudentFromUserInput();

        }
        return createStudents;
    }

    /*
    Добавьте метод fillStudentsArrayFromUserInput для заполнения
массива элементами Student.
     */
    public int fillStudentsArrayFromUserInput() {
        Student[] fillStudents = createStudentsArrayFromUserInput();

        for (Student student : fillStudents) {
            repository.add(student);
        }
        return fillStudents.length;
    }
    public boolean fillStudentFromUserInput() {
        Student student = createStudentFromUserInput();
        return repository.add(student);
    }
    public void printStudents() {
        System.out.println("All saved students: ");
        for (Student student : repository.getAllStudents()) {
        System.out.println(student);
    }
}
public void printSortedStudents() {
    System.out.println("\nAll saved students sorted by lust name: ");
    for (Student student : repository.sortedBySurname()) {
        System.out.println("\t" + student);
    }
}
}
