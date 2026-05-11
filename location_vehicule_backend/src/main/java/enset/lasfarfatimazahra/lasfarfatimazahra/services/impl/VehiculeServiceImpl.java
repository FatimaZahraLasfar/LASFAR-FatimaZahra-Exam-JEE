package enset.lasfarfatimazahra.lasfarfatimazahra.services.impl;

import enset.lasfarfatimazahra.lasfarfatimazahra.dtos.VehiculeDTO;
import enset.lasfarfatimazahra.lasfarfatimazahra.entities.Voiture;
import enset.lasfarfatimazahra.lasfarfatimazahra.mappers.VehiculeMapper;
import enset.lasfarfatimazahra.lasfarfatimazahra.repositories.VehiculeRepository;
import enset.lasfarfatimazahra.lasfarfatimazahra.services.interfaces.VehiculeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VehiculeServiceImpl
        implements VehiculeService {

    private final VehiculeRepository repository;

    @Override
    public VehiculeDTO saveVehicule(
            VehiculeDTO dto) {

        Voiture voiture = new Voiture();

        voiture.setMarque(dto.getMarque());
        voiture.setModele(dto.getModele());
        voiture.setMatricule(dto.getMatricule());
        voiture.setPrixParJour(
                dto.getPrixParJour()
        );

        repository.save(voiture);

        return dto;
    }

    @Override
    public List<VehiculeDTO> getVehicules() {

        return repository.findAll()
                .stream()
                .map(VehiculeMapper::fromEntity)
                .toList();
    }

    @Override
    public VehiculeDTO getVehicule(Long id) {

        return VehiculeMapper.fromEntity(
                repository.findById(id).get()
        );
    }

    @Override
    public void deleteVehicule(Long id) {

        repository.deleteById(id);
    }
}