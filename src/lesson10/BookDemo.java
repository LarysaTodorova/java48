package lesson10;

public class BookDemo {
    public static void main(String[] args) {
/*
Необходимо написать метод, который бы проверял есть ли номер каталога у книги или нет
 */
        CreateBook create = new CreateBook();
        Book book1 = create.createNewBook();

        System.out.println(book1);

        Book book2 = create.createNewBook();
        System.out.println(book2);

        String idNumber1 = book1.getIdNumber();
        String idNumber2 = book2.getIdNumber();


        if (idNumber1.equals(idNumber2)){
            System.out.println("Номер одинаковый:");

        }else {
            System.out.println( "Разные номера");
        }


        }

    }


