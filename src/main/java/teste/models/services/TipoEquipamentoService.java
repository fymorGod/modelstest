package teste.models.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import teste.models.models.tipoEquipamento.TipoEquipamento;
import teste.models.models.tipoEquipamento.TipoEquipamentoRepository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TipoEquipamentoService {

    @Autowired
    private TipoEquipamentoRepository repository;

    @Transactional
    public TipoEquipamento save(TipoEquipamento tipoEquipamento) {
        return repository.save(tipoEquipamento);
    }

    public List<TipoEquipamento> findAll(){
        return repository.findAll();
    }
    public Optional<TipoEquipamento> findById(UUID id){
        return repository.findById(id);
    }

    @Transactional
    public void delete(TipoEquipamento tipoEquipamento) {
        repository.delete(tipoEquipamento);
    }
}
