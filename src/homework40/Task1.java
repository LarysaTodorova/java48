package homework40;

import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        /*
         Дан список строк. Необходимо отфильтровать из этого списка все строки,
         которые начинаются на букву "A" (без учёта регистра), и вернуть список этих строк,
         отсортированный в алфавитном порядке.
         */

        List<String> words = Arrays.asList("Apple","argument","Banana","Peach","Alexa");

        List<String> sortedWords = words.stream()
                .filter(word -> word.toLowerCase().startsWith("a"))
                .sorted()
                .toList();

        System.out.println(sortedWords);
    }
}
