package homeWork8;

public class BookDemo {

    public static void main(String[] args) {

        Book book1 = new Book("Bulgakov", "Master i Margarita");
        Book book2 = new Book("Rik Riordan", "Geroi Olimpa", 560, 214, false);
        System.out.println("Информация о первой книге: " +  book1);
        System.out.println("Информация о второй книге: " +  book2);

        book1.setPageCount(470);
        book1.setBookID(122);
        book1.setStorage(true);
        System.out.println("Обновленная информация: " + book1);






    }

}
