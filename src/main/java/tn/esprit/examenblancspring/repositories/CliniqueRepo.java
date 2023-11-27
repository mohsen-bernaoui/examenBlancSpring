package tn.esprit.examenblancspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examenblancspring.entities.Clinique;

public interface CliniqueRepo extends JpaRepository<Clinique,Long> {
}
