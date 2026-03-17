package lesson29HashMap.studentVar2;

public class Demo {
    public static void main(String[] args) {

        StudentGrade studentGrade = new StudentGrade();

        studentGrade.addGrade("Alex", "Math", 5);
        studentGrade.addGrade("Alex", "English", 4);
        studentGrade.addGrade("Alex", "Logic", 4);

        studentGrade.addGrade("Robert", "Math", 5);
        studentGrade.addGrade("Robert", "English", 4);
        studentGrade.addGrade("Robert", "Logic", 3);


        //распечатаем данные о студентах
        studentGrade.getAllGrades("Alex");
        System.out.println("===================");
        studentGrade.getAllGrades("Robert");


    }
}
