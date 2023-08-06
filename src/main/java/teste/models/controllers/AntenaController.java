package teste.models.controllers;

import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import teste.models.dtos.AntenaDTO;
import teste.models.models.antena.Antena;
import teste.models.services.AntenaService;
import teste.models.services.TipoEquipamentoService;
import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/antena")
public class AntenaController {

    @Autowired
    private AntenaService antenaService;
    @Autowired
    private TipoEquipamentoService tipoEquipamentoService;
    @PostMapping
    public ResponseEntity<Antena> saveAntena(@RequestBody @Valid AntenaDTO antenaDTO) {
        var antenaModel = new Antena();

        BeanUtils.copyProperties(antenaDTO, antenaModel);
        antenaModel.setCreatedAt(LocalDateTime.now(ZoneId.of("-03:00")));
        return ResponseEntity.status(HttpStatus.CREATED).body(antenaService.save(antenaModel));
    }
}
