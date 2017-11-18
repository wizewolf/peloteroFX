package com.metodologia.sistemapelotero.repository;


import com.metodologia.sistemapelotero.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<Usuario, Integer>
{
    Usuario findById(int id);

    @Query("select u from Usuario u where u.name = ?1")
    Usuario findByUsername(String name);
}
