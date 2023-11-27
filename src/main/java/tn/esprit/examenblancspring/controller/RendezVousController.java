package tn.esprit.examenblancspring.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.examenblancspring.service.RendezvousServiceIMP;

@RestController
@AllArgsConstructor
@Slf4j
public class RendezVousController {
    private RendezvousServiceIMP rendezvousServiceIMP;
    @GetMapping("retrieveRdv")
    public void retrieveRdv() {
        rendezvousServiceIMP.retrieveRdv();
    }
}
