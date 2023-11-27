package tn.esprit.examenblancspring.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.examenblancspring.entities.Patient;
import tn.esprit.examenblancspring.repositories.PatientRepo;
@Service
@AllArgsConstructor
public class PatientServiceIMP implements IPatient{
    private PatientRepo patientRepo;
    @Override
    public Patient addPatient(Patient patient) {
        return patientRepo.save(patient);
    }
}
