package homework37.task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PersonDemo {

    public static void main(String[] args) {
        /*
        Дана коллекция Person - Имя, возраст, список навыков (например языки программирования)
        Нужно найти все уникальные навыки которыми обладают люди старше 25 лет и отсортировать их
         */

        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Person1", 26, Arrays.asList("English", "French", "Italian")));
        persons.add(new Person("Person2", 50, Arrays.asList("English", "German", "Italian")));
        persons.add(new Person("Person3", 30, Arrays.asList("Romanian", "French", "Spanish")));
        persons.add(new Person("Person4", 20, Arrays.asList("Ukrainian", "German", "Bulgarian")));
        persons.add(new Person("Person5", 45, Arrays.asList("English", "French", "German")));

        List<String> sortedSkills = persons.stream()
                .filter(p -> p.getAge() > 25)
                .flatMap(p -> p.getSkills().stream())
                .distinct()
                .sorted()
                .toList();

        System.out.println(sortedSkills);

    }
}
