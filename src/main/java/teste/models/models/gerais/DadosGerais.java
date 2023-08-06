package teste.models.models.gerais;

import jakarta.validation.constraints.NotBlank;

public record DadosGerais(
        @NotBlank
        String codigo,
        @NotBlank
        String marca,
        @NotBlank
        String modelo
) {
}
