package com.hogar.system_comedor.service;


import java.util.List;

import com.hogar.system_comedor.dominio.tablaMaestra;

public interface ITablaMaestraService {
	public Long registrarTablaMaestra(tablaMaestra registro);
	
	public Long modificarTablaMaestra(tablaMaestra registro);
	
	public Long eliminarTablaMaestra(tablaMaestra registro);
	
	public List<tablaMaestra> listarRegistro(tablaMaestra registro);
}
