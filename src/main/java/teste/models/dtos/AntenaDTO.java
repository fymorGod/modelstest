package teste.models.dtos;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import teste.models.enums.Categorias;
import teste.models.enums.Status;
import teste.models.enums.TiposAntena;
import teste.models.models.gerais.Gerais;

import java.util.UUID;

public record AntenaDTO(
        @NotNull
        @Valid
        Gerais gerais,

        @NotNull
        Status status,

        @NotNull
        Categorias categorias,

        @NotNull
        TiposAntena tiposAntena,

        @NotBlank
        String vr,

        @NotNull
        Double fendas,

        @NotNull
        Double posicao_torre,

        @NotBlank
        String gain,

        @NotNull
        UUID tipoEquipamento
) {

}
