package com.metodologia.sistemapelotero.service.imp;

import com.metodologia.sistemapelotero.entity.Combo;
import com.metodologia.sistemapelotero.entity.Factura;
import com.metodologia.sistemapelotero.entity.Fiesta;
import com.metodologia.sistemapelotero.entity.LineaDeFactura;
import com.metodologia.sistemapelotero.entity.Pago;
import com.metodologia.sistemapelotero.entity.Servicio;
import com.metodologia.sistemapelotero.repository.FacturaRepository;
import com.metodologia.sistemapelotero.repository.LineaFacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Service
public class FacturaServiceImplementation {

    @Autowired
    FacturaRepository facturaRepository;

    @Autowired
    LineaFacturaRepository lineaFacturaRepository;

    private static int total;
    private static final int MAX_CHICOS = 15;
    private static final double PRECIO_ADICIONAL = 100;

    private static final DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public List<Factura> findAll() {
        return facturaRepository.findAll();
    }

    public void crearFactura(Date fecha){
        Factura factura = new Factura();
        factura.setFecha(fecha);
        factura.setTotal(0);
        facturaRepository.save(factura);
    }

    public void delete(int id){
        facturaRepository.delete(id);
    }

    public void update(Factura factura, int id){
        factura.setId(id);
        facturaRepository.save(factura);
    }

    public Factura findById(int id){
        return facturaRepository.findById(id);
    }

    public void addPago(int id, Pago pago){
       Factura factura = facturaRepository.findById(id);
       factura.setTotal(factura.getTotal() + pago.getMonto());
       factura.getPagos().add(pago);
       facturaRepository.save(factura);
    }

    public double getDiferencia(int id){
        Factura factura = facturaRepository.findById(id);
        Set<Pago> pagos = factura.getPagos();
        double totalPagado = pagos.stream().mapToDouble(o->o.getMonto()).sum();
        /*
        int totalPagado = 0;
        Iterator<Pago> pagoIterator = pagos.iterator();
        while (pagoIterator.hasNext()){
            P
        }*/
        return factura.getTotal() - totalPagado;
    }

    public void addFiesta(int id, Fiesta fiesta) {
        Factura factura = facturaRepository.findById(id);
        total  = 0;

        //TODO: ARREGLA LA FECHA
        //LocalDate localDate = LocalDate.now();
        //Date today = new Date(DateTimeFormatter.ofPattern("yyy-MM-dd").format(localDate));
        //factura.setFecha(today);

        factura.getLineaDeFacturaSet().add(getLineaCombo(fiesta.getCombo(), fiesta.isTurno1(), fiesta.isTurno2()));
        if(fiesta.getCantChicos() > MAX_CHICOS) {
            factura.getLineaDeFacturaSet().add(getLineaAdicionalChicos(fiesta.getCantChicos() - MAX_CHICOS));
        }
        if(fiesta.getServicio() != null) {
            factura.getLineaDeFacturaSet().add(getLineaServicio(fiesta.getServicio()));
        }

        factura.setTotal(total);
        facturaRepository.save(factura);
    }

    private LineaDeFactura getLineaAdicionalChicos(int adicionales){
        LineaDeFactura lineaDeFactura = new LineaDeFactura();
        lineaDeFactura.setCantidad(adicionales);
        lineaDeFactura.setPrecioUnitario(adicionales * PRECIO_ADICIONAL );
        lineaDeFactura.setDescripcion("Extra por invitados adicionales");
        return lineaDeFactura;
    }

    private LineaDeFactura getLineaCombo(Combo combo, boolean turno1, boolean turno2){
        LineaDeFactura lineaCombo = new LineaDeFactura();
        double precio = combo.getPrecio();
        if(turno1 && turno2){
            precio *= 2;
        }
        lineaCombo.setPrecioUnitario(precio);
        total += precio;
        lineaCombo.setDescripcion("Combo " + combo.getId());
        return lineaCombo;
    }

    private LineaDeFactura getLineaServicio(Servicio servicio){
        LineaDeFactura lineaDeFactura = new LineaDeFactura();
        if(servicio.isFoto() && servicio.isVideo()){
            lineaDeFactura.setPrecioUnitario(2000);
            total += 2000;
            lineaDeFactura.setDescripcion("Servicio de Fotos y Video");
        }
        else if(servicio.isFoto()){
            lineaDeFactura.setPrecioUnitario(1000);
            total += 1000;
            lineaDeFactura.setDescripcion("Servicio de Fotos");
        }
        else {
            lineaDeFactura.setPrecioUnitario(1500);
            total += 1500;
            lineaDeFactura.setDescripcion("Servicio de Video");
        }
        return lineaDeFactura;
    }
}
