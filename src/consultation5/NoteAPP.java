package consultation5;

import lesson5.superCalc.UserInput;

public class NoteAPP {
    public static void main(String[] args) {

        NoteService service = new NoteService();
        UserInput userInput = new UserInput();

        int id = userInput.inputInteger("Введите номер заметки:");
        String description = userInput.inputText("Содержание:");
        int dayNumber = userInput.inputInteger("Введите номер дня недели 1 - 7 ");

        Note note1 = service.createNote(id, description, dayNumber);
        service.printNote(note1);

    }

}
