package teste.models.controllers;

import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import teste.models.dtos.TipoEquipamentoDTO;
import teste.models.models.tipoEquipamento.TipoEquipamento;
import teste.models.services.TipoEquipamentoService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/tipoequipamento")
public class TipoEquipamentoController {

    @Autowired
    private TipoEquipamentoService service;

    @PostMapping
    public ResponseEntity<TipoEquipamento> saveTipoEquipamento(@RequestBody @Valid TipoEquipamentoDTO tipoEquipamentoDTO) {
        var tipoEquipamentoModel = new TipoEquipamento();
        BeanUtils.copyProperties(tipoEquipamentoDTO, tipoEquipamentoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(tipoEquipamentoModel));
    }
}
