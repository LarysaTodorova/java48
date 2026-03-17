package myselfWork39.front;

import lesson5.superCalc.UserInput;
import myselfWork39.back.dto.Request;
import myselfWork39.back.dto.Response;
import myselfWork39.back.entity.Note;
import myselfWork39.back.service.AddUpdateDeleteService;
import myselfWork39.back.service.FindService;

public class Menu {
    private UserInput userInput;
    private AddUpdateDeleteService addUpdateDeleteService;
    private FindService findService;

    public Menu(UserInput userInput, AddUpdateDeleteService addUpdateDeleteService, FindService findService) {
        this.userInput = userInput;
        this.addUpdateDeleteService = addUpdateDeleteService;
        this.findService = findService;
    }

    public void start() {

        while (true) {

            printMenu();

            Integer userChoice = userInput.inputInteger("Select a menu item: ");

            switch (userChoice) {
                case 1: addNewNote();
                break;
                case 2: findAllNotes();
                    break;
                case 3: findNoteById();
                    break;
                case 4: findNoteByName();
                    break;
                case 5: updateNote();
                    break;
                case 6: deleteNote();
                    break;
                case 7: return;
                default:;

                    System.out.println("Incorrect menu item selection");
            }

        }
    }

    private void addNewNote() {
        System.out.println("Entering a new note:");
        String noteName = userInput.inputText("Enter a title of note");
        String noteDescription = userInput.inputText("Enter a description of note");

        Request request = new Request(noteName, noteDescription);

        Response<Note> response = addUpdateDeleteService.addNone(request);

        printResponse(response);
    }

    private void findAllNotes() {
        System.out.println("All notes:");
        printResponse(findService.findAll());
    }

    private void findNoteById() {
        System.out.println("Search note by ID");
        Integer noteId = userInput.inputInteger("Enter note ID");
        printResponse(findService.findNoteById(noteId));
    }

    private void findNoteByName() {
        System.out.println("Search notes by name");
        String noteName = userInput.inputText("Enter a title of note");
        printResponse(findService.findByName(noteName));
    }

    private void updateNote() {
        System.out.println("Update note");
        Integer noteId = userInput.inputInteger("Enter a note ID");
        String description = userInput.inputText("Enter a note description");

        Response<Note> updateNote = addUpdateDeleteService.updateNote(noteId, description);
        printResponse(updateNote);
    }

    private void deleteNote() {
        System.out.println("Delete note");
        Integer noteId = userInput.inputInteger("Enter a note Id");
        printResponse(addUpdateDeleteService.deleteNote(noteId));
    }

    private void printMenu() {
        System.out.println();
        System.out.println("Users menu:");
        System.out.println("1. Add new note");
        System.out.println("2. Find all notes");
        System.out.println("3. Find note by ID");
        System.out.println("4. Find note by name");
        System.out.println("5. Update note");
        System.out.println("6. Delete note");
        System.out.println("Exit");
    }

    private static <T> void  printResponse (Response<T> response) {
        if (response.getMessage().isEmpty()) {
            System.out.println(response.getBody());
        }else {
            System.out.println(response.getMessage());
        }
    }
}
