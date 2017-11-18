package com.metodologia.sistemapelotero.service.imp;

import com.metodologia.sistemapelotero.entity.Bebida;
import com.metodologia.sistemapelotero.entity.LineaDeFactura;
import com.metodologia.sistemapelotero.entity.Pago;
import com.metodologia.sistemapelotero.enums.MedioDePago;
import com.metodologia.sistemapelotero.repository.BebidaRepository;
import com.metodologia.sistemapelotero.repository.LineaFacturaRepository;
import com.metodologia.sistemapelotero.repository.PagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagoServiceImplementation {

    @Autowired
    PagoRepository pagoRepository;

    @Autowired
    LineaFacturaRepository lineaFacturaRepository;

    @Autowired
    BebidaRepository bebidaRepository;

    public void savePago(Pago pago) {
        pagoRepository.save(pago);
    }

    public Pago pagarBebida(LineaDeFactura lineaDeFactura, MedioDePago medioDePago){
        Pago pago = new Pago();
        pago.setMedioDePago(medioDePago);
        pago.setMonto(lineaDeFactura.getCantidad()*lineaDeFactura.getPrecioUnitario());
        pagoRepository.save(pago);
        return pago;
    }

    public LineaDeFactura comprarBebida(Bebida bebida, int cantidad){
        if(bebida.getStock() >= cantidad){
            LineaDeFactura lineaDeFactura = new LineaDeFactura();
            lineaDeFactura.setCantidad(cantidad);
            bebida.setStock(bebida.getStock() - cantidad);
            bebidaRepository.save(bebida);
            lineaDeFactura.setDescripcion(bebida.getNombre() + " - " + bebida.getMarca());
            lineaDeFactura.setPrecioUnitario(bebida.getPrecio());
            lineaFacturaRepository.save(lineaDeFactura);
            return lineaDeFactura;
        }
        return null;
    }

    public Pago findById(int id) {
        return pagoRepository.findById(id);
    }

    public void delete(int id) {
        pagoRepository.delete(id);
    }

    public void update(int id, Pago pago) {
        pago.setId(id);
        pagoRepository.save(pago);
    }

    public List<Pago> findAll() {
        return pagoRepository.findAll();
    }
}
