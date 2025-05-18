package com.fiap.brinquedos.controller;

import com.fiap.brinquedos.entity.Brinquedo;
import com.fiap.brinquedos.service.BrinquedoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brinquedos")
public class BrinquedoController {

    @Autowired
    private BrinquedoService service;

    @GetMapping
    public List<Brinquedo> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Brinquedo> buscarId(@PathVariable Long id) {
        return service.buscarId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Brinquedo> criar(@Valid @RequestBody Brinquedo brinquedo) {
        return ResponseEntity.ok(service.salvar(brinquedo));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Brinquedo> atualizar(@PathVariable Long id, @Valid @RequestBody Brinquedo brinquedo) {
        return service.buscarId(id).map(b -> {
            brinquedo.setId(id);
            return ResponseEntity.ok(service.salvar(brinquedo));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        return service.buscarId(id).map(b -> {
            service.deletar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
