package tn.esprit.examenblancspring.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Set;

@Entity
@ToString
@Getter
@Setter
public class Medecin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMedecin;
    private String nomMedecin;
    private int telephone;
    private int prixConsultation;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Clinique> cliniques;

    @OneToMany(mappedBy = "medecins",cascade = CascadeType.ALL)
    private Set<RendezVous>rendezVous;
}
