package consultation7;

import lesson5.superCalc.UserInput;

public class App {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        LibraryServiceCreate create = new LibraryServiceCreate();
        LibraryServiceFind find = new LibraryServiceFind();


         int numberBooksOfShelf = userInput.inputInteger("Введите количество книг на полке:");

        int numberOfShelves = userInput.inputInteger("Введите количество полок:");
        Library library = new Library(numberOfShelves);

        for (int i = 0; i < numberOfShelves; i++) {
            BookShelf currentBookShelf = new BookShelf(i, numberBooksOfShelf);

            
        }



    }
}
