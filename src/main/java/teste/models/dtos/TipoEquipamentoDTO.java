package teste.models.dtos;

import jakarta.validation.constraints.NotBlank;
import teste.models.models.antena.Antena;

import java.util.List;

public record TipoEquipamentoDTO (
        @NotBlank
        String name,
        List<Antena> antena
){
}
