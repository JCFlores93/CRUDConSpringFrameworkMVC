package com.hogar.system_comedor.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
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

	public List<Cliente> listarClientes(Cliente cliente) {
		StringBuilder cadena =  new StringBuilder("select c from Cliente c.Direcciones where");
		if(cliente.idCliente != null && cliente.idCliente != 0){
			cadena.append(" and c.idCliente = :idCliente");
		}
		Query query = getSession().createQuery(cadena.toString());
		if(cliente.idCliente != null && cliente.idCliente != 0){
			query.setParameter("idCliente", cliente.getIdCliente());
		}
		
		List<Object> listObject = query.list();
		
		
		return null;
	}

}
