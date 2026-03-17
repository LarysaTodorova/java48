package lesson10;

import lesson5.superCalc.UserInput;

public class CreateBook {
    /*
    Создайте сервисный класс в котором будут методы,
которые создают новые книги получая необходимые данные от пользователя

- create()
- *) update (поменять номер в каталоге)
     */
    UserInput userInput = new UserInput();
    public Book createNewBook(){
        String author = userInput.inputText("Введите имя автора:");
        String bookName = userInput.inputText("Введите название книги:");
        int page = userInput.inputInteger("Введите количество страниц:");
        String idNumber = userInput.inputText("Введите номер в каталоге:");

        Book newBook = new Book(author,bookName,page,idNumber);

        return newBook;
    }
}
