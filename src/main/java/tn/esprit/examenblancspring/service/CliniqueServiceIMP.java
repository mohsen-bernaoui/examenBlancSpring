package tn.esprit.examenblancspring.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.examenblancspring.entities.Clinique;
import tn.esprit.examenblancspring.repositories.CliniqueRepo;

@AllArgsConstructor
@Service
public class CliniqueServiceIMP implements IClinique{
    private CliniqueRepo cliniqueRepo;
    @Override
    public Clinique addClinique(Clinique clinique) {
        return cliniqueRepo.save(clinique);
    }
}
