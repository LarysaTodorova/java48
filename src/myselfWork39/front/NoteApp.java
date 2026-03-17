package myselfWork39.front;

import lesson5.superCalc.UserInput;
import myselfWork39.back.repository.InMemoryRepository;
import myselfWork39.back.repository.NoteRepository;
import myselfWork39.back.service.AddUpdateDeleteService;
import myselfWork39.back.service.FindService;
import myselfWork39.back.service.Validation;

public class NoteApp {
    public static void main(String[] args) {

        InMemoryRepository repository = new NoteRepository();

        Validation validation = new Validation();

        AddUpdateDeleteService addUpdateDeleteService = new AddUpdateDeleteService(repository, validation);
        FindService findService = new FindService(repository);

        UserInput userInput = new UserInput();
        Menu menu = new Menu(userInput, addUpdateDeleteService, findService);

        menu.start();

    }
}
