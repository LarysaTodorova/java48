package lesson39.back.service;

import lesson39.back.dto.Request;
import lesson39.back.dto.Response;
import lesson39.back.entity.Note;
import lesson39.back.repository.InMemoryRepository;
import lesson39.back.repository.NoteRepository;

import java.util.Optional;

public class AddUpdateDeleteService {

    private InMemoryRepository repository;
    private Validation validation;

    public AddUpdateDeleteService(InMemoryRepository repository, Validation validation) {
        this.repository = repository;
        this.validation = validation;
    }

    public Response<Note> addNewNote(Request request) {

        // проверка корректности введенных данных

        String validationResult = validation.validate(request.getName(), request.getDescription());

        if (validationResult.isEmpty()) {

            Note savedNote = repository.add(request.getName(),request.getDescription());

            return new  Response <>(savedNote,validationResult);
        } else {
            return new Response<>(null,validationResult);
        }
    }

    public Response<Note> updateNote(Integer id,String noteDescription) {

        Optional<Note> noteForUpdateByIdOptional = repository.findById(id);

        if (noteForUpdateByIdOptional.isPresent()) {
            Note noteAfterUpdate = repository.updateNote(noteForUpdateByIdOptional.get(),noteDescription);

            return new Response<>(noteAfterUpdate,"");
        }else {
            return new Response<>(null,"заметка с id = " + id + " не найдена.");}
    }

    public Response<Note> deleteNote(Integer id) {

        Optional<Note> noteForDeleteOptional = repository.findById(id);

        if (noteForDeleteOptional.isPresent()) {
            Note noteForDelete = repository.deleteNote(noteForDeleteOptional.get());

            return new Response<>(noteForDelete,"");
        }else {
            return new Response<>(null,"заметка с id = " + id + " не найдена. Удаление невозможно.");}
    }
}
