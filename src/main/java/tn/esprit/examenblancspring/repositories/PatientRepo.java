package tn.esprit.examenblancspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examenblancspring.entities.Patient;

public interface PatientRepo extends JpaRepository<Patient,Long> {
}
