package teste.models.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import teste.models.models.antena.Antena;
import teste.models.models.antena.AntenaRepository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AntenaService {
    @Autowired
    private AntenaRepository repository;

    @Transactional
    public Antena save(Antena antena) {
        return repository.save(antena);
    }
    public List<Antena> findAll() {
        return repository.findAll();
    }
    public Optional<Antena> findById(UUID id) {
        return repository.findById(id);
    }

    @Transactional
    public void delete(Antena antena) {
        repository.delete(antena);
    }
}
