package tn.esprit.examenblancspring.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.examenblancspring.entities.Patient;
import tn.esprit.examenblancspring.service.PatientServiceIMP;

@RestController
@AllArgsConstructor
@Slf4j
public class PatientController {
    private PatientServiceIMP patientServiceIMP;
    @PostMapping("/addPatient")
    public Patient addPatient(@RequestBody Patient patient) {
        return patientServiceIMP.addPatient(patient);
    }
}
