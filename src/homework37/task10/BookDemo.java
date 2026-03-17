package homework37.task10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookDemo {
    public static void main(String[] args) {
        /*
        Необходимо получить список всех уникальных тегов
         */

        List<Book> books = new ArrayList<>();

        books.add(new Book("Book1","Author1", Arrays.asList("Tag1","Tag2","Tag3")));
        books.add(new Book("Book2","Author2", Arrays.asList("Tag7","Tag5","Tag4")));
        books.add(new Book("Book3","Author3", Arrays.asList("Tag5","Tag10","Tag10")));
        books.add(new Book("Book4","Author4", Arrays.asList("Tag4","Tag2","Tag1")));
        books.add(new Book("Book5","Author1", Arrays.asList("Tag3","Tag1","Tag3")));
        books.add(new Book("Book6","Author3", Arrays.asList("Tag7","Tag5","Tag4")));

        List<String> uniqTags = books.stream()
                .flatMap(b -> b.getTags().stream())
                .distinct()
                .toList();

        System.out.println(uniqTags);



    }
}
