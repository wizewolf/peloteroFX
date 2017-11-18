package com.metodologia.sistemapelotero.repository;

import com.metodologia.sistemapelotero.entity.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<Factura, Integer>{
    Factura findById(int id);
}
