package com.fiap.brinquedos.repository;

import com.fiap.brinquedos.entity.Brinquedo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrinquedoRepository extends JpaRepository<Brinquedo, Long> {
}
