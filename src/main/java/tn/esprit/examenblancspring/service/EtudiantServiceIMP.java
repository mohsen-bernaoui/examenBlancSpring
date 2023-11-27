package tn.esprit.examenblancspring.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.examenblancspring.entities.Etudiant;
import tn.esprit.examenblancspring.repositories.EtudiantRepo;

import java.util.List;

@AllArgsConstructor
@Service
public class EtudiantServiceIMP implements IEtudiant {
    private EtudiantRepo etudiantRepo;
    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepo.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepo.save(e);
    }

    @Override
    public List<Etudiant> findallEtudiant() {
        return etudiantRepo.findAll();
    }

    @Override
    public Etudiant findById(long idE) {
        return etudiantRepo.findById(idE).orElse(null);
    }

    @Override
    public void deleteEtud(long idE) {
        etudiantRepo.deleteById(idE);
    }
}
