package com.metodologia.sistemapelotero.repository;


import com.metodologia.sistemapelotero.entity.Combo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ComboRepository extends JpaRepository<Combo, Integer> {

    Combo findById(int id);

    @Query("select c from Combo c where c.precio = ?1")
    Combo findByPrecio(double precio);
}
