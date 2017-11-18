package com.metodologia.sistemapelotero.repository;

import com.metodologia.sistemapelotero.entity.Bebida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BebidaRepository extends JpaRepository<Bebida, Integer> {
    Bebida findById(int id);
}
