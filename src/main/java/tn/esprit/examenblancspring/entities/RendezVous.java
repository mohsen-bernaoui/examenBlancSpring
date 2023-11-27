package tn.esprit.examenblancspring.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Entity
@ToString
@Getter
@Setter
public class RendezVous implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idRDV;
    @Temporal(TemporalType.DATE)
    private Date dateRDV;
    private String remarque;

    @ManyToOne
    private Medecin medecins;
    @ManyToOne
    private Patient patients;
}
