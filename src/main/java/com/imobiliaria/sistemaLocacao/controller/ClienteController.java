package com.imobiliaria.sistemaLocacao.controller;


import com.imobiliaria.sistemaLocacao.entity.Cliente;
import com.imobiliaria.sistemaLocacao.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/api/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping()
    public List<Cliente> getAllClientes() {
        return clienteService.getAllClientes();
    }

    @GetMapping("/{id}")
    public Cliente getClienteById(@PathVariable Long id) {
        return clienteService.getClienteById(id);
    }

    @PostMapping()
    public void salvar(@RequestBody Cliente cliente) {
        clienteService.salvar(cliente);
    }

}
