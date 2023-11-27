package tn.esprit.examenblancspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.examenblancspring.entities.RendezVous;
import tn.esprit.examenblancspring.entities.Specialite;

import java.util.List;

public interface RendezRepo extends JpaRepository<RendezVous,Long> {
    //@Query("SELECT r FROM RendezVous WHERE (r.clinique=:clinique)AND (r.medecin=:cadio)")
    //List<RendezVous> getRendezVousByCliniqueAndSpecialite(@Param(clinique) Long idClinique,@Param(cadio) Specialite cardio);
}
