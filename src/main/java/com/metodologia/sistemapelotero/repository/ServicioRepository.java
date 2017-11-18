package com.metodologia.sistemapelotero.repository;

import com.metodologia.sistemapelotero.entity.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicioRepository extends JpaRepository<Servicio, Integer> {
    Servicio findById(int id);
}
