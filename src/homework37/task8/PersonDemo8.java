package homework37.task8;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class PersonDemo8 {
    public static void main(String[] args) {
        /*
        Необходимо найти среднюю зарплату всех мужчин в возрасте от 25 до 40 лет.
         */

        List<Person8> persons = new ArrayList<>();

        persons.add(new Person8("Person1", 35, "F", 3500.0));
        persons.add(new Person8("Person2", 23, "M", 5000.0));
        persons.add(new Person8("Person3", 39, "M", 4700.0));
        persons.add(new Person8("Person4", 45, "F", 3200.0));
        persons.add(new Person8("Person5", 35, "M", 7500.0));

        double avgSalary = persons.stream()
                .filter(p -> p.getGender().equals("M"))
                .filter(p -> p.getAge() >= 25 && p.getAge() <= 40)
                .mapToInt(p -> (int) p.getSalary())
                .average()
                .orElse(0);

        System.out.println(avgSalary);


    }
}
