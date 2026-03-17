package homework37.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class String2 {
    public static void main(String[] args) {
        /*
        коллекция String - получить строку содержащую все элементы этой коллекции
         */

        List<String> list = new ArrayList<>();
        list.add("Hallow");
        list.add("World");
        list.add("I");
        list.add("Like");
        list.add("Java");


        System.out.println(list);

        String result = list.stream()
                .collect(Collectors.joining(" "));

        System.out.println(result);


    }
}
