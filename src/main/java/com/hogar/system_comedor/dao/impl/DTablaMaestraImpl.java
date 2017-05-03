package com.hogar.system_comedor.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.hogar.system_comedor.dao.ITablaMaestraDao;
import com.hogar.system_comedor.dominio.tablaMaestra;

@Repository
@Transactional
public class DTablaMaestraImpl extends AbstractCrudDao implements ITablaMaestraDao{

	public Long registrarTablaMaestra(tablaMaestra registro) {
		Long idRegistro = null;
		try{
			idRegistro = save(registro);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		return idRegistro;
	}

	public Long modificarTablaMaestra(tablaMaestra registro) {
		Long idRegistro=null;
		try {
			idRegistro=update(registro);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return idRegistro;
	}

	public Long eliminarTablaMaestra(tablaMaestra registro) {
		Long idRegistro=null;
		try {
			idRegistro=delete(registro);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return idRegistro;
	
	}
	
	public List<tablaMaestra> listarRegistro(tablaMaestra registro) {
		StringBuilder cadena =  new StringBuilder("select t from Tabla_Maestra t where 1=1");
		if(registro.ID != null && registro.ID != 0){
			cadena.append(" and t.ID = :ID");
		}
		Query query = getSession().createQuery(cadena.toString());
		if(registro.ID != null && registro.ID != 0){
			query.setParameter("ID", registro.getID());
		}
		
		List<Object> listObject = query.list();
		return null;
	}}
	
	
	