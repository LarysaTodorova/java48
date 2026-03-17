package consultation7;

import lesson5.superCalc.UserInput;

public class LibraryServiceCreate {
    

    public Author createNewAuthor() {

        UserInput userInput = new UserInput();

        String authorName = userInput.inputText("Введите имя автора:");

        Author newAuthor = new Author(authorName);
        return newAuthor;

    }

    public Book createNewBook(Author[] authors) {

        UserInput userInput = new UserInput();

        String title = userInput.inputText("Введите название книги:");
        String genre = userInput.inputText("Введите жанр книги:");
        String authorName = userInput.inputText("Введите имя автора:");

        Author authorSearch = searchAuthor(authors, authorName);


        Book newBook = new Book(title, genre, authorSearch);
        return newBook;

    }

    private  Author searchAuthor(Author[] authors,String authorName) {
        for (int i = 0; i < authors.length; i++) {
            if (authors[i].getAuthorName().equals(authorName)){
                return authors[i];

            }
        }
        return null;
    }

}
