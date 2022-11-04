package kr.doo.toy04jpa.repository;

import kr.doo.toy04jpa.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;


public interface NoteRepository extends JpaRepository<Note, Long> {
}
