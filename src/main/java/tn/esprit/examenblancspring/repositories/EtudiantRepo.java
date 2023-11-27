package tn.esprit.examenblancspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examenblancspring.entities.Etudiant;
@Repository
public interface EtudiantRepo extends JpaRepository<Etudiant,Long> {
}
