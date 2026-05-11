package enset.lasfarfatimazahra.lasfarfatimazahra.repositories;


import enset.lasfarfatimazahra.lasfarfatimazahra.entities.Vehicule;
import enset.lasfarfatimazahra.lasfarfatimazahra.enums.StatutVehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface VehiculeRepository
        extends JpaRepository<Vehicule, Long> {

    List<Vehicule> findByStatut(
            StatutVehicule statut
    );
}