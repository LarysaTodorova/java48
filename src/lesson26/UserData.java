package lesson26;

import lesson23.hospital.Patient;
import lesson5.superCalc.UserInput;

public class UserData {
    UserInput userInput = new UserInput();



    public int enterFilmSize() {
        int filmSize = userInput.inputInteger("Enter a film size:");
        return filmSize;
    }

    public Film createFilm() {
        String filmGenre = userInput.inputText("Enter a genre of film:");
        String filmTitle = userInput.inputText("Enter a title of film");

       Film newFilm = new Film(filmGenre, filmTitle);

        return newFilm;
    }
}
