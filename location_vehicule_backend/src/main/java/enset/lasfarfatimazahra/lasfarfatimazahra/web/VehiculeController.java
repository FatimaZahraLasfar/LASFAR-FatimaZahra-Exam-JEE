package enset.lasfarfatimazahra.lasfarfatimazahra.web;

import enset.lasfarfatimazahra.lasfarfatimazahra.dtos.VehiculeDTO;
import enset.lasfarfatimazahra.lasfarfatimazahra.services.interfaces.VehiculeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicules")
@RequiredArgsConstructor
@CrossOrigin("*")
public class VehiculeController {

    private final VehiculeService service;

    @GetMapping("/vehicules")
    public List<VehiculeDTO> getVehicules(){

        return service.getVehicules();
    }

    @PostMapping
    public VehiculeDTO saveVehicule(
            @RequestBody VehiculeDTO dto){

        return service.saveVehicule(dto);
    }

    @GetMapping("/{id}")
    public VehiculeDTO getVehicule(
            @PathVariable Long id){

        return service.getVehicule(id);
    }

    @DeleteMapping("/{id}")
    public void deleteVehicule(
            @PathVariable Long id){

        service.deleteVehicule(id);
    }
}