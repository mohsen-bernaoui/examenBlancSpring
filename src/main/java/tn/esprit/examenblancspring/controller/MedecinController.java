package tn.esprit.examenblancspring.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.examenblancspring.entities.Medecin;
import tn.esprit.examenblancspring.service.MedecinServiceIMP;

@RestController
@AllArgsConstructor
@Slf4j
public class MedecinController {
    private MedecinServiceIMP medecinServiceIMP;
    @PostMapping("/addMedecinAndAssignToClinique/{cliniqueId}")
    public Medecin addMedecinAndAssignToClinique(@RequestBody Medecin medecin,@PathVariable Long cliniqueId) {
        return medecinServiceIMP.addMedecinAndAssignToClinique(medecin,cliniqueId);
    }
}
