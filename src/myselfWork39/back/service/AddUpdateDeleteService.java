package myselfWork39.back.service;

import myselfWork39.back.dto.Request;
import myselfWork39.back.dto.Response;
import myselfWork39.back.entity.Note;
import myselfWork39.back.repository.InMemoryRepository;

import java.util.Optional;

public class AddUpdateDeleteService {

    private InMemoryRepository repository;
    private Validation validation;

    public AddUpdateDeleteService(InMemoryRepository repository, Validation validation) {
        this.repository = repository;
        this.validation = validation;
    }

    public Response<Note> addNone(Request request) {
        String validationResult = validation.validate(request);
        if (validationResult.isEmpty()) {
            Note savedNote = repository.add(request);
            return new Response<>(savedNote, validationResult);
        } else {
            return new Response<>(null, validationResult);
        }
    }

    public Response<Note> updateNote(Integer id, String description) {
        Optional<Note> noteForUpdate = repository.findById(id);
        if (noteForUpdate.isPresent()) {
            Note noteAfterUpdate = repository.update(noteForUpdate.get(), description);
            return new Response<>(noteAfterUpdate, "");
        }else {
            return new Response<>(null, "We have not the note with such Id: " + id);
        }
    }

    public Response<Note> deleteNote(Integer id) {
        Optional<Note> noteForDeleteOpt = repository.findById(id);
        if (noteForDeleteOpt.isPresent()) {
            Note noteForDelete = repository.delete(noteForDeleteOpt.get());
            return new Response<>(noteForDelete, "");
        }else {
            return new Response<>(null, "We have not the note with such Id: " + id + "removing is impossible");
        }
    }
}
