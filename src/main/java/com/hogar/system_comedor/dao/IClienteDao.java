package com.hogar.system_comedor.dao;

import java.util.List;

import com.hogar.system_comedor.dominio.Cliente;

public interface IClienteDao {
	public Long registrarCliente(Cliente cliente);
	public List<Cliente> listarClientes(Cliente cliente);
}
