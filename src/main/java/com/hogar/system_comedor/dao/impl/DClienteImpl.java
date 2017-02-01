package com.hogar.system_comedor.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.hogar.system_comedor.dao.IClienteDao;
import com.hogar.system_comedor.dominio.Cliente;

@Repository
@Transactional
public class DClienteImpl extends AbstractCrudDao implements IClienteDao{

	public Long registrarCliente(Cliente cliente) {
		Long idCliente = null;
		try{
			idCliente = save(cliente);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		return idCliente;
	}

}
