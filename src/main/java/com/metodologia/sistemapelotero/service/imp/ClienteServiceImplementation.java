package com.metodologia.sistemapelotero.service.imp;

import com.metodologia.sistemapelotero.entity.Cliente;
import com.metodologia.sistemapelotero.repository.ClienteRepository;
import com.metodologia.sistemapelotero.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImplementation implements ClienteService{

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public void saveCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public Cliente findById(int id) {
        return clienteRepository.findById(id);
    }

    @Override
    public void deleteCliente(int id) {
        clienteRepository.delete(id);
    }

    @Override
    public void updateCliente(int id, Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }
}
