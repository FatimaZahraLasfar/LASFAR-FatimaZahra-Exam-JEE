package enset.lasfarfatimazahra.lasfarfatimazahra.services.interfaces;

import enset.lasfarfatimazahra.lasfarfatimazahra.dtos.VehiculeDTO;

import java.util.List;

public interface VehiculeService {

    VehiculeDTO saveVehicule(
            VehiculeDTO dto
    );

    List<VehiculeDTO> getVehicules();

    VehiculeDTO getVehicule(Long id);

    void deleteVehicule(Long id);
}
