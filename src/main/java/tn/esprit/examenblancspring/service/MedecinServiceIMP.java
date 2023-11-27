package tn.esprit.examenblancspring.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.examenblancspring.entities.Clinique;
import tn.esprit.examenblancspring.entities.Medecin;
import tn.esprit.examenblancspring.repositories.CliniqueRepo;
import tn.esprit.examenblancspring.repositories.MedecinRepo;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Service
@Slf4j
public class MedecinServiceIMP implements IMedecin{
    private MedecinRepo medecinRepo;
    private CliniqueRepo cliniqueRepo;
    @Override
    public Medecin addMedecinAndAssignToClinique(Medecin medecin, Long cliniqueId) {
        Clinique clinique=cliniqueRepo.findById(cliniqueId).orElse(null);
        Set<Clinique>cliniqueSet=new HashSet<>();
        cliniqueSet.add(clinique);
        medecin.setCliniques(cliniqueSet);
        return medecinRepo.save(medecin);
    }
}
