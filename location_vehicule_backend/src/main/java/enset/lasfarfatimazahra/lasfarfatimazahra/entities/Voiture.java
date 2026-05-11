package enset.lasfarfatimazahra.lasfarfatimazahra.entities;

import enset.lasfarfatimazahra.lasfarfatimazahra.enums.BoiteVitesse;
import enset.lasfarfatimazahra.lasfarfatimazahra.enums.TypeCarburant;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Voiture extends Vehicule {

    private int nombrePortes;

    @Enumerated(EnumType.STRING)
    private TypeCarburant typeCarburant;

    @Enumerated(EnumType.STRING)
    private BoiteVitesse boiteVitesse;
}