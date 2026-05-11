package enset.lasfarfatimazahra.lasfarfatimazahra.entities;

import enset.lasfarfatimazahra.lasfarfatimazahra.enums.TypeMoto;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Moto extends Vehicule{
    private int cylindree;

    @Enumerated(EnumType.STRING)
    private TypeMoto typeMoto;

    private boolean casqueInclus;
}
