package homeWork8;

public class StudentDemo {
    public static void main(String[] args) {

        Group group1 = new Group("A10","01.10.22024",35);
        Group group2 = new Group("B15", "01.04.2025", 32);

        Student student1 = new Student("Beck", "Ludwig", 25, group1);
        Student student2 = new Student("Harry", "Kate", 9, group2);
        Student student3 = new Student("Rupp", "Alex", 15, group1);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);


    }

}
