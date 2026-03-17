package homework41.task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonDemo {
    public static void main(String[] args) {
/*
Чтение данных из CSV файла и обработка их Описание: Написать программу на Java,
которая будет читать данные из CSV (Comma-Separated Values) файла, используя классы FileReader и BufferedReader,
и обрабатывать их. Программа должна способна разбирать строки из файла на поля, разделенные запятыми,
и выполнять определенные операции на данных, такие как суммирование, поиск определенных значений и т.д.
 */

        List<Person> persons = getPersonInfo("src/homework41/task3/personFile");
        System.out.println("Count of persons: " + persons.size());


        List<Person> getPosition = persons.stream()
                .filter(person -> person.getPosition().equals("Developer"))
                .collect(Collectors.toList());

        System.out.println("Count of Developer positions: " + getPosition.size());


    }

    private static List<Person> getPersonInfo(String path) {
        List<Person> persons = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {

            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length == 4) {
                    int id = Integer.parseInt(data[0]);
                    String name = data[1];
                    int age = Integer.parseInt(data[2]);
                    String position = data[3];

                    persons.add(new Person(id, name, age, position));
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return persons;
    }
}
