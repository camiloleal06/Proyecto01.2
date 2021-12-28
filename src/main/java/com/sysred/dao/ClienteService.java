package com.sysred.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.sysred.model.Cliente;

@Service
public class ClienteService implements InterfaceClienteService{

	@Autowired
	ClienteRepository clienteDao;
	
	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return clienteDao.findAll();
	}

	@Override
	public Page<Cliente> findAll(Pageable page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		clienteDao.save(cliente);
	}

	@Override
	public Cliente findOne(Long id) {
		// TODO Auto-generated method stub
		return clienteDao.getById(id);
	}

	@Override
	public void delete(Long id) {
	 clienteDao.deleteById(id);
		
	}

	@Override
	public void delete(Cliente cliente) {
		clienteDao.delete(cliente);
		
	}

}
