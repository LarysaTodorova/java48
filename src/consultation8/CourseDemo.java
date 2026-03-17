package consultation8;

public class CourseDemo {
    /*
    Написать приложение для учета студентов и их занятий

Онлайн школа
- Группы
- Студенты
- Лекции

     */

    public static void main(String[] args) {

        Student student1 = new Student(1, "Anna", 1);
        Student student2 = new Student(2, "Oliver", 2);
        Student student3 = new Student(3, "Ivan", 3);
        Student student4 = new Student(4, "Mary", 3);
        Student student5 = new Student(5, "Boris", 2);
        Student student6 = new Student(6, "Frank", 1);
        Student student7 = new Student(7, "Alexa", 1);

        Student[] students1 = {student1,  student3, student4,  student6,};
        Student[] students2 = {student2, student5,student7};


        Lesson lesson1 = new Lesson(1, "FrontEnd");
        Lesson lesson2 = new Lesson(2, "BackEnd");
        Lesson lesson3 = new Lesson(3, "IT English");
        Lesson lesson4 = new Lesson(4, "QA");

        Lesson[] lessons1 = {lesson1,  lesson3, lesson4};
        Lesson[] lessons2 = {lesson2,  lesson3, lesson4};

        TimeTable timeTable1 = new TimeTable("Monday", lesson1);
        TimeTable timeTable2 = new TimeTable("Tuesday", lesson1);
        TimeTable timeTable3 = new TimeTable("Wednesday", lesson4);
        TimeTable timeTable4 = new TimeTable("Thursday", lesson2);
        TimeTable timeTable5 = new TimeTable("Friday", lesson3);

        TimeTable[] timeTables = {timeTable1, timeTable3, timeTable4, timeTable5};
        TimeTable[] timeTables1 = {timeTable2, timeTable3, timeTable4, timeTable5};


        Group group1 = new Group(1, "Group1", students1, lessons1, timeTables);
        Group group2 = new Group(2, "Group2", students2, lessons2, timeTables1);

        System.out.println(group1);
        System.out.println(group2);



    }
}
