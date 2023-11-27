package tn.esprit.examenblancspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examenblancspring.entities.Medecin;

public interface MedecinRepo extends JpaRepository<Medecin,Long> {
}
