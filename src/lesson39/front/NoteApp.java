package lesson39.front;

import lesson39.back.repository.InMemoryRepository;
import lesson39.back.repository.NoteRepository;
import lesson39.back.service.AddUpdateDeleteService;
import lesson39.back.service.FindNoteService;
import lesson39.back.service.Validation;
import lesson39.front.userMenu.Menu;
import lesson5.superCalc.UserInput;

public class NoteApp {
    public static void main(String[] args) {

        InMemoryRepository noteRepository = new NoteRepository();
        Validation validation = new Validation();

        AddUpdateDeleteService service = new AddUpdateDeleteService(noteRepository,validation);
        FindNoteService findNoteService = new FindNoteService(noteRepository);

        UserInput userInput = new UserInput();
        Menu menu = new Menu(userInput,service,findNoteService);

        menu.start();


    }
}
