package com.metodologia.sistemapelotero.service.imp;

import com.metodologia.sistemapelotero.entity.Bebida;
import com.metodologia.sistemapelotero.repository.BebidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BebidaServiceImplementation {

    @Autowired
    BebidaRepository bebidaRepository;

    public void saveBebida(Bebida bebida) {
        bebidaRepository.save(bebida);
    }

    public Bebida findById(int id) {
        return bebidaRepository.findById(id);
    }

    public void deleteBebida(int id) {
        bebidaRepository.delete(id);
    }

    public void updateBebida(int id, Bebida bebida) {
        bebida.setId(id);
        bebidaRepository.save(bebida);
    }

    public List<Bebida> findAll() {
        return bebidaRepository.findAll();
    }
}
