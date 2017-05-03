package com.hogar.system_comedor.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hogar.system_comedor.dao.ITablaMaestraDao;
import com.hogar.system_comedor.dominio.tablaMaestra;
import com.hogar.system_comedor.service.ITablaMaestraService;

@Service
public class NTablaMaestraImpl implements ITablaMaestraService {
	@Autowired
	private ITablaMaestraDao iTablaMaestraDao;

	public Long registrarTablaMaestra(tablaMaestra registro) {

		return iTablaMaestraDao.registrarTablaMaestra(registro);
	}

	public Long modificarTablaMaestra(tablaMaestra registro) {
		return iTablaMaestraDao.modificarTablaMaestra(registro);

	}

	public Long eliminarTablaMaestra(tablaMaestra registro) {
		return iTablaMaestraDao.eliminarTablaMaestra(registro);
	}

	public List<tablaMaestra>listarRegistro(tablaMaestra registro) {
		// TODO Auto-generated method stub
		return iTablaMaestraDao.listarRegistro(registro);
	}

}
