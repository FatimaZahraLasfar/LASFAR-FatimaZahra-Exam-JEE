package enset.lasfarfatimazahra.lasfarfatimazahra.dtos;

import lombok.Data;

@Data
public class VehiculeDTO {

    private Long id;

    private String marque;

    private String modele;

    private String matricule;

    private double prixParJour;

}