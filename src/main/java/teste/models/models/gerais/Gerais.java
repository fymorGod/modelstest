package teste.models.models.gerais;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Gerais {

    private String codigo;
    private String marca;
    private String modelo;

    public Gerais(DadosGerais gerais) {
        this.codigo = gerais.codigo();
        this.marca = gerais.marca();
        this.modelo = gerais.modelo();
    }

}
