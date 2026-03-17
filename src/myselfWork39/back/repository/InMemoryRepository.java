package myselfWork39.back.repository;

import myselfWork39.back.dto.Request;
import myselfWork39.back.entity.Note;

import java.util.List;
import java.util.Optional;

public interface InMemoryRepository {

    Note add(Request request);
    List<Note> findAll();
    Optional<Note> findById(Integer id);
    List<Note> findByName(String name);
    Note update(Note noteForUpdate, String description);
    Note delete(Note noteForDelete);
}
