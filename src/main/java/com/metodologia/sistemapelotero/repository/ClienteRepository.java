package com.metodologia.sistemapelotero.repository;

import com.metodologia.sistemapelotero.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    Cliente findById(int id);
}
