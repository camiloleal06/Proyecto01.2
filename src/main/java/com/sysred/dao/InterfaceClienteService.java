package com.sysred.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.sysred.model.Cliente;
public interface InterfaceClienteService {
public List<Cliente> findAll();
public Page<Cliente> findAll(Pageable page); 
public void saveCliente(Cliente cliente);
public Cliente findOne(Long id);
public void delete(Long id);
public void delete(Cliente cliente);

}
