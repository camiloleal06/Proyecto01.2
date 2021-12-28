package com.sysred.dao;

import com.sysred.model.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
public interface InterfaceClienteService {
public List<Cliente> findAll();
public Page<Cliente> findAll(Pageable page); 
public void saveCliente(Cliente cliente);
public Cliente findOne(Long id);
public void delete(Long id);
public void delete(Cliente cliente);

}
