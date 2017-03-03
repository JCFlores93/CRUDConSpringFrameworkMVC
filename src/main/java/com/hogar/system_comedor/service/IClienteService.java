package com.hogar.system_comedor.service;

import java.util.List;

import com.hogar.system_comedor.dominio.Cliente;

public interface IClienteService {
	public Long registrarCliente(Cliente cliente); 
	public List<Cliente> listarClientes(Cliente cliente);
}
