package lesson39.back.service;

import lesson39.back.dto.Response;
import lesson39.back.entity.Note;
import lesson39.back.repository.InMemoryRepository;

import java.util.List;
import java.util.Optional;

public class FindNoteService {

    private InMemoryRepository repository;

    public FindNoteService(InMemoryRepository repository) {
        this.repository = repository;
    }

    public Response<List<Note>> findAll() {
        List<Note> allNotes = repository.findAll();
        if (allNotes.isEmpty()) {
            return new Response<>(allNotes, "База данных пустая!");
        } else {
            return new Response<>(allNotes, "");
        }
    }

    public Response<Note> findById(Integer id) {
        Optional<Note> foundedNoteOpt = repository.findById(id);
        if (foundedNoteOpt.isPresent()) {
            return new Response<>(foundedNoteOpt.get(),"");
        }else {
            return new Response<>(null, "Заметка с id : " + id + " не найдена!");
        }
    }

    public Response<List<Note>> findByName(String name) {
        List<Note> foundedNotes = repository.findByName(name);
        if (foundedNotes.isEmpty()) {
            return new Response<>(foundedNotes,"Заметки с таким названием: " + name + " не существует!");
        }else {
            return new Response<>(foundedNotes,"");
        }
    }
}
