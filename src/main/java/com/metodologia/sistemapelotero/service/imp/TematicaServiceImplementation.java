package com.metodologia.sistemapelotero.service.imp;

import com.metodologia.sistemapelotero.entity.Tematica;
import com.metodologia.sistemapelotero.repository.TematicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TematicaServiceImplementation {

    @Autowired
    TematicaRepository tematicaRepository;

    public void save(Tematica tematica) {
        tematicaRepository.save(tematica);
    }

    public List<Tematica> findAll() {
        return tematicaRepository.findAll();
    }

    public Tematica findById(int id){
        return tematicaRepository.findById(id);
    }

    public void delete(int id){
        tematicaRepository.delete(id);
    }

    public void update(int id, Tematica tematica){
        tematica.setId(id);
        tematicaRepository.save(tematica);
    }
}
