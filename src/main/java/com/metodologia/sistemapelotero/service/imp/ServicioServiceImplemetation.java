package com.metodologia.sistemapelotero.service.imp;

import com.metodologia.sistemapelotero.entity.Servicio;
import com.metodologia.sistemapelotero.repository.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioServiceImplemetation {

    @Autowired
    ServicioRepository servicioRepository;

    public void save(Servicio servicio) {
        servicioRepository.save(servicio);
    }

    public Servicio findById(int id) {
        return servicioRepository.findById(id);
    }

    public void delete(int id) {
        servicioRepository.delete(id);
    }

    public void update(int id, Servicio servicio) {
        servicio.setId(id);
        servicioRepository.save(servicio);
    }

    public List<Servicio> findAll() {
        return servicioRepository.findAll();
    }
}
