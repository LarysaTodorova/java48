package lesson8;

import lesson5.superCalc.UserInput;

public class StudentManager {

    public Student createStudents() {

        UserInput userInput = new UserInput();

        String surname = userInput.inputText("Введите имя студента");
        String name = userInput.inputText("Введите фамилию студента");
        String studentID = userInput.inputText("номер студента");
        String group = userInput.inputText("Группу студента");

        Student student = new Student(surname, name, studentID, group);

        return student;

    }
}
