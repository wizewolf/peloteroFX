package com.metodologia.sistemapelotero.repository;

import com.metodologia.sistemapelotero.entity.Pago;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagoRepository extends JpaRepository<Pago, Integer> {

    Pago findById(int id);
}
