package enset.lasfarfatimazahra.lasfarfatimazahra.entities;

import enset.lasfarfatimazahra.lasfarfatimazahra.enums.StatutVehicule;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marque;

    private String modele;

    private String matricule;

    private double prixParJour;

    private LocalDate dateMiseEnService;

    @Enumerated(EnumType.STRING)
    private StatutVehicule statut;

    @ManyToOne
    private Agence agence;
}