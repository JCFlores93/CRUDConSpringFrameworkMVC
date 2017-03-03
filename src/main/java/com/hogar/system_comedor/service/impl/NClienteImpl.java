package com.hogar.system_comedor.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hogar.system_comedor.dao.IClienteDao;
import com.hogar.system_comedor.dominio.Cliente;
import com.hogar.system_comedor.service.IClienteService;

@Service
public class NClienteImpl implements IClienteService{

	@Autowired
	private IClienteDao iClienteDao;
	
	public Long registrarCliente(Cliente cliente) {
		return iClienteDao.registrarCliente(cliente);
	}
	
	public List<Cliente> listarClientes(Cliente cliente) {
		return iClienteDao.listarClientes(cliente);
	}

}
