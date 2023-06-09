package com.barbershop.repo;

import com.barbershop.model.Notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotesRepo extends JpaRepository<Notes, Long> {
    List<Notes> findAllByNameContainingAndCategory_Name(String name, String categoryName);
}
