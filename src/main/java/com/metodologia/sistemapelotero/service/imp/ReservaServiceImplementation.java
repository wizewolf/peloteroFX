package com.metodologia.sistemapelotero.service.imp;

import com.metodologia.sistemapelotero.entity.Reserva;
import com.metodologia.sistemapelotero.repository.ReservaRepository;
import com.metodologia.sistemapelotero.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaServiceImplementation implements ReservaService{

    @Autowired
    ReservaRepository reservaRepository;

    public void save(Reserva reserva) {
        reservaRepository.save(reserva);
    }

    public List<Reserva> findAll() {
        return reservaRepository.findAll();
    }
}
