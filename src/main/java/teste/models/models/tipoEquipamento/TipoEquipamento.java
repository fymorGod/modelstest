package teste.models.models.tipoEquipamento;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import teste.models.models.antena.Antena;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Table(name = "tipo_equipamento")
@Entity
@Getter
@Setter
public class TipoEquipamento implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "tipoEquipamento", cascade = CascadeType.ALL)
    private List<Antena> antena;
}
