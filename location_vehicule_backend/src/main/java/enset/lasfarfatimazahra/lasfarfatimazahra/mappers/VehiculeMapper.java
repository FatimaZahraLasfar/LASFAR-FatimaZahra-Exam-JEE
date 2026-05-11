package enset.lasfarfatimazahra.lasfarfatimazahra.mappers;

import enset.lasfarfatimazahra.lasfarfatimazahra.dtos.VehiculeDTO;
import enset.lasfarfatimazahra.lasfarfatimazahra.entities.Vehicule;

public class VehiculeMapper {

    public static VehiculeDTO fromEntity(
            Vehicule vehicule){

        VehiculeDTO dto =
                new VehiculeDTO();

        dto.setId(vehicule.getId());
        dto.setMarque(vehicule.getMarque());
        dto.setModele(vehicule.getModele());
        dto.setMatricule(vehicule.getMatricule());
        dto.setPrixParJour(
                vehicule.getPrixParJour()
        );

        return dto;
    }
}
