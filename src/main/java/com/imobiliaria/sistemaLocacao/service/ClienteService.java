package com.imobiliaria.sistemaLocacao.service;

import com.imobiliaria.sistemaLocacao.entity.Cliente;
import com.imobiliaria.sistemaLocacao.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> getAllClientes() {
        System.out.println("Listando clientes: ");
        return clienteRepository.findAll();
    }
    public Cliente getClienteById(Long id) {
        System.out.println("Buscando cliente com ID: " + id);
        return clienteRepository.findById(id).orElse(null);
    }
    public void salvar(Cliente cliente) {
        System.out.println("Salvando cliente: " + cliente.getNome());
        clienteRepository.save(cliente);
    }


}
