package com.metodologia.sistemapelotero.service;

import com.metodologia.sistemapelotero.entity.Rol;
import com.metodologia.sistemapelotero.entity.Usuario;

import java.util.List;

/**
 * Created by Eli on 17/10/2017.
 */
public interface RolService {
    void saveRol(Rol rol);

    Rol findById(int id);

    void deleteRol(int id);


    void updateRol(int id, Rol rol);

    List<Rol> findAll();

    Rol findByRolname(String rolname);
}
