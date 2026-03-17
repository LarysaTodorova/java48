package homework37.task2;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class String1 {
    public static void main(String[] args) {


    /*
    коллекция String - получить коллекцию элементов у которых нечетное количество символов
     */

        List<String> strings = Arrays.asList("One", "Two", "Three", "One", "Five", "Four", "Five");

        List<String> sortedStrings = strings.stream()
                .filter(string -> string.length() % 2 != 0)
                .toList();

        System.out.println(sortedStrings);
    }
}
