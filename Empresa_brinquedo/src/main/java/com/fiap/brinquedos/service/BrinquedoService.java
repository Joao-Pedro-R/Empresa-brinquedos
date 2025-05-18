package com.fiap.brinquedos.service;

import com.fiap.brinquedos.entity.Brinquedo;
import com.fiap.brinquedos.repository.BrinquedoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrinquedoService {

    @Autowired
    private BrinquedoRepository repository;

    public List<Brinquedo> listarTodos() {
        return repository.findAll();
    }

    public Optional<Brinquedo> buscarId(Long id) {
        return repository.findById(id);
    }

    public Brinquedo salvar(Brinquedo brinquedo) {
        return repository.save(brinquedo);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
