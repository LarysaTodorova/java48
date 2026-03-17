package lesson10;

import consultation4.Author;
import lesson5.superCalc.UserInput;

public class CreateBook2 {

    UserInput userInput = new UserInput();
    public Book2Book createNewBook2(){
        String book2Author = userInput.inputText("Введите автора:");
        String bookName = userInput.inputText("Введите текст:");
        int bookPage = userInput.inputInteger("Введите количество страниц:");
        String bookId = userInput.inputText("Введите номер в каталоге:");

        Book2Author book2Author1= new Book2Author(book2Author);

        Book2Book book2Book = new Book2Book(bookName, bookPage, bookId, book2Author1);

        if (bookId.equals("")){
            bookId = "notFound";
        }

        return book2Book;

    }



}
