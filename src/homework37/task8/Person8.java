package homework37.task8;

public class Person8 {
    /*
    Дан список объектов Person, содержащий информацию о людях, включая имя, возраст, пол и зарплату.
     Необходимо найти среднюю зарплату всех мужчин в возрасте от 25 до 40 лет.
     */
    private String name;
    private int age;
    private String gender;
    private double salary;

    public Person8(String name, int age, String gender, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Person8{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }
}
