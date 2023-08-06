package teste.models.models.antena;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import teste.models.enums.Categorias;
import teste.models.enums.Status;
import teste.models.enums.TiposAntena;
import teste.models.models.gerais.Gerais;
import teste.models.models.tipoEquipamento.TipoEquipamento;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Table(name = "antena")
@Entity
@Getter
@Setter
public class Antena implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Embedded
    private Gerais gerais;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 60)
    private Categorias categorias;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 60)
    private Status status;

    @Column(nullable = false, length = 120)
    private String gain;
    @Column(nullable = false)
    private Double fendas;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TiposAntena tiposAntena;

    @Column(nullable = false)
    private Double posicao_torre;
    @Column(nullable = false, length = 120)
    private String vr;

    @ManyToOne
    @JoinColumn(name = "tipoEquipamento_id")
    private TipoEquipamento tipoEquipamento;

    @Column(nullable = false)
    private LocalDateTime createdAt;
    @Column
    private LocalDateTime updatedAt;


}
