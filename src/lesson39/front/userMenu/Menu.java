package lesson39.front.userMenu;

import lesson39.back.dto.Request;
import lesson39.back.dto.Response;
import lesson39.back.entity.Note;
import lesson39.back.service.AddUpdateDeleteService;
import lesson39.back.service.FindNoteService;
import lesson5.superCalc.UserInput;

import java.util.List;

public class Menu {

    private UserInput userInput;
    private AddUpdateDeleteService addUpdateDeleteService;
    private FindNoteService findNoteService;

    public Menu(UserInput userInput, AddUpdateDeleteService addUpdateDeleteService, FindNoteService findNoteService) {
        this.userInput = userInput;
        this.addUpdateDeleteService = addUpdateDeleteService;
        this.findNoteService = findNoteService;
    }

    public void start() {

        while (true) {


            printMenu();

            Integer userChoice = userInput.inputInteger("Выберите пункт меню:");

            switch (userChoice) {
                case 1: adNewNote();
                break;
                case 2: findAllNotes();
                    break;
                case 3: findNoteById();
                    break;
                case 4: findNotesByName();
                    break;
                case 5: updateNote();
                    break;
                case 6: deleteNote();
                    break;
                case 7: return;
                default:
                    System.out.println("Не корректный выбор пункта меню");

            }

        }
    }

    private void deleteNote() {
        System.out.println("Удаление заметки");
        Integer noteId = userInput.inputInteger("Введите ID заметки");

        Response<Note> response = addUpdateDeleteService.deleteNote(noteId);
        printResponse(response);

    }

    private void updateNote() {
        System.out.println("Обновление заметки");
        Integer noteId = userInput.inputInteger("Введите ID заметки");
        String noteUpdate = userInput.inputText("Введите новый текст заметки");

        Response<Note> response = addUpdateDeleteService.updateNote(noteId,noteUpdate);
        printResponse(response);
        

    }

    private void findNotesByName() {
        System.out.println("Поиск заметки по названию");
        String  noteName = userInput.inputText("Введите название заметки");

        Response<List<Note>> response = findNoteService.findByName(noteName);
        printResponse(response);

    }

    private void findNoteById() {
        System.out.println("Поиск заметки по ID");
        Integer noteId = userInput.inputInteger("Введите номер заметки");

        Response<Note> response = findNoteService.findById(noteId);
        printResponse(response);
    }

    private void findAllNotes() {
        System.out.println("Все заметки:");
        Response<List<Note>> response = findNoteService.findAll();

        printResponse(response);

    }

    private void adNewNote() {
        System.out.println("Ввод новой заметки:");
        String noteName = userInput.inputText("Введите название заметки:");
        String noteDescription = userInput.inputText("Введите описание заметки:");
        Request request = new Request(noteName,noteDescription);

        Response<Note> response = addUpdateDeleteService.addNewNote(request);

        printResponse(response);

    }


    private void printMenu() {
        System.out.println();
        System.out.println("Пользовательское меню:");
        System.out.println("1. Добавить новую заметку");
        System.out.println("2. Найти все заметки");
        System.out.println("3. Найти заметку по ID");
        System.out.println("4. Найти заметки по названию");
        System.out.println("5. Обновить заметку");
        System.out.println("6. Удалить заметку");
        System.out.println("7. Выход");
    }

    private static <T> void printResponse(Response<T> response) {
        if (response.getMessage().isEmpty()) {
            System.out.println(response.getBody());
        }else {
            System.out.println(response.getMessage());
        }
    }

}
