package tn.esprit.examenblancspring.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.examenblancspring.entities.Clinique;
import tn.esprit.examenblancspring.service.CliniqueServiceIMP;

@RestController
@AllArgsConstructor
@Slf4j
public class CliniqueController {
    private CliniqueServiceIMP cliniqueServiceIMP;
    @PostMapping("/addClinique")
    public Clinique addClinique(@RequestBody Clinique clinique) {
        return cliniqueServiceIMP.addClinique(clinique);
    }
}
