package tn.esprit.examenblancspring.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examenblancspring.entities.Etudiant;
import tn.esprit.examenblancspring.service.EtudiantServiceIMP;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
public class EtudiantController {
    private EtudiantServiceIMP etudiantServiceIMP;
    @PostMapping("/addEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e){return etudiantServiceIMP.addEtudiant(e);}
    @PutMapping("/updateEtudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant e){return etudiantServiceIMP.updateEtudiant(e);}
    @GetMapping("/getAll")
    public List<Etudiant> findallEtudiant(){return etudiantServiceIMP.findallEtudiant();}
    @GetMapping("/getEtudiant/{idE}")
    public Etudiant findById(@PathVariable long idE){
        return etudiantServiceIMP.findById(idE);
    }
    @DeleteMapping("/deleteEtudiant/{idE}")
    public void deleteEtud(@PathVariable long idE){
        etudiantServiceIMP.deleteEtud(idE);
    }
}
