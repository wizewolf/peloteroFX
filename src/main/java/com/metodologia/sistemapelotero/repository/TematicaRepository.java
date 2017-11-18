package com.metodologia.sistemapelotero.repository;

import com.metodologia.sistemapelotero.entity.Tematica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TematicaRepository extends JpaRepository<Tematica, Integer> {
    Tematica findById(int id);
}
