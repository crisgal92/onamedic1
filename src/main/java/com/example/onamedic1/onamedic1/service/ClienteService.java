package com.example.onamedic1.onamedic1.service;

import com.example.onamedic1.onamedic1.entity.Cliente;

import java.util.List;

public interface ClienteService {
    Cliente save(Cliente cliente);
    List<Cliente> findAll();
    Cliente findById(Integer id);
    void deleteByID(Integer id);
    Cliente update(Cliente cliente);
}
