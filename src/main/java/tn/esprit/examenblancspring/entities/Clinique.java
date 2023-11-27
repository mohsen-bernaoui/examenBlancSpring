package tn.esprit.examenblancspring.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Entity
@ToString
@Getter
@Setter
public class Clinique implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idClinique;
    private String nomClinique;
    private String adresse;
    private int telephone;
    @JsonIgnore
    @ManyToMany(mappedBy = "cliniques")
    private List<Medecin> medecins;


}
