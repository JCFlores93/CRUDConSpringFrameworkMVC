package com.hogar.system_comedor.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hogar.system_comedor.dominio.tablaMaestra;
import com.hogar.system_comedor.service.ITablaMaestraService;

@Controller
@RequestMapping("/tablaMaestra")
public class TablaMaestraController {

	@Autowired
	private ITablaMaestraService iTablaMaestraservice;

	@RequestMapping(value = "/registrarRegistro", method = RequestMethod.GET)
	public String registrarTablaMaestra(HttpServletRequest request, HttpSession session) {
		tablaMaestra registro = new tablaMaestra();
		registro.setCodigo("flores123");
		registro.setDescripcion("estudiante");
		registro.setDominio("unfv");
		Long idTablaMaestra = iTablaMaestraservice.registrarTablaMaestra(registro);
		return "";
	}

	@RequestMapping(value = "/actualizarRegistro", method = RequestMethod.GET)
	public String modificarTablaMaestra(HttpServletRequest request, HttpSession session) {
		tablaMaestra registro = new tablaMaestra();
		registro.setID((long) (200));
		registro.setCodigo("carrasco123");
		registro.setDescripcion("Hola Mundo");
		registro.setDominio("Hola Mundo");
		Long idTablaMaestra1 = iTablaMaestraservice.modificarTablaMaestra(registro);
		return "";
	}

	@RequestMapping(value = "/eliminarRegistro", method = RequestMethod.GET)
	public String eliminarTablaMaestra(HttpServletRequest request, HttpSession session) {
		tablaMaestra registro = new tablaMaestra();
		registro.setID((long) (200));
		registro.setCodigo("carrasco123");
		registro.setDescripcion("Hola Mundo");
		registro.setDominio("Hola Mundo");
		Long idTablaMaestra2 = iTablaMaestraservice.eliminarTablaMaestra(registro);
		return "";
	}
	
	@RequestMapping(value="/consultarRegistro",method=RequestMethod.GET)
		public String consultarRegistro(HttpServletRequest request,HttpSession session){
		tablaMaestra registro=new tablaMaestra();
		registro.setID((Long.parseLong("0")));
		iTablaMaestraservice.listarRegistro(registro);
		return "";
	}
}
