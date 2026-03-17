package consultation4;

public class BookDemo {
    public static void main(String[] args) {

        Author author = new Author("Гетте", "Классик");
        Book book = new Book("Игра в биссер", "Классика", author);
        System.out.println(book);

    }

}
