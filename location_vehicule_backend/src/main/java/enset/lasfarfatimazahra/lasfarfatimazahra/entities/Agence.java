package enset.lasfarfatimazahra.lasfarfatimazahra.entities;

import enset.lasfarfatimazahra.lasfarfatimazahra.entities.Vehicule;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private String adresse;

    private String ville;

    private String telephone;

    @OneToMany(mappedBy = "agence")
    private List<Vehicule> vehicules;
}