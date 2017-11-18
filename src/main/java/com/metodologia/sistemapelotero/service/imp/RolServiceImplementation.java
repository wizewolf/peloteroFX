package com.metodologia.sistemapelotero.service.imp;

import com.metodologia.sistemapelotero.entity.Rol;
import com.metodologia.sistemapelotero.entity.Usuario;
import com.metodologia.sistemapelotero.repository.RolRepository;
import com.metodologia.sistemapelotero.repository.UserRepository;
import com.metodologia.sistemapelotero.service.RolService;
import com.metodologia.sistemapelotero.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServiceImplementation implements RolService{

        @Autowired
        RolRepository rolRepository;

    @Override
    public Rol findByRolname(String rolname) {
        return null;
    }

    @Override
    public void saveRol(Rol rol) {
        rolRepository.save(rol);
    }

    @Override
    public Rol findById(int id) {
        return rolRepository.findById(id);
    }

    @Override
    public void deleteRol(int id) {
        rolRepository.delete(id);
    }

    @Override
    public void updateRol(int id, Rol rol) {
        rol.setId(id);
        rolRepository.save(rol);
    }

    @Override
    public List<Rol> findAll() {
        return rolRepository.findAll();
    }

}
