package com.metodologia.sistemapelotero.repository;

import com.metodologia.sistemapelotero.entity.LineaDeFactura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LineaFacturaRepository extends JpaRepository<LineaDeFactura, Integer> {
    LineaDeFactura findById(int id);
}
