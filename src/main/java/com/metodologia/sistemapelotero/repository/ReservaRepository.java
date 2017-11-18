package com.metodologia.sistemapelotero.repository;

import com.metodologia.sistemapelotero.entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
}
