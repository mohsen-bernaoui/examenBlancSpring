package tn.esprit.examenblancspring.service;

import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.examenblancspring.repositories.RendezRepo;

@Service
@AllArgsConstructor
public class RendezvousServiceIMP implements IRendezVous{
    private RendezRepo rendezRepo;


    @Override
    @Scheduled(fixedRate = 3000)
    public void retrieveRdv() {
                rendezRepo.findAll();
    }
}
