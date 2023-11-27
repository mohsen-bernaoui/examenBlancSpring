package tn.esprit.examenblancspring.service;

import tn.esprit.examenblancspring.entities.Medecin;

public interface IMedecin {
    public Medecin addMedecinAndAssignToClinique(Medecin medecin,Long cliniqueId);
}
