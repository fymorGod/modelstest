package teste.models.models.tipoEquipamento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface TipoEquipamentoRepository extends JpaRepository<TipoEquipamento, UUID> {
}
