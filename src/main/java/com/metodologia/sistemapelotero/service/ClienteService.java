package com.metodologia.sistemapelotero.service;

import com.metodologia.sistemapelotero.entity.Cliente;

import java.util.List;

public interface ClienteService {

    void saveCliente(Cliente cliente);
    Cliente findById(int id);
    void deleteCliente(int id);
    void updateCliente(int id, Cliente cliente);
    List<Cliente> findAll();

}
