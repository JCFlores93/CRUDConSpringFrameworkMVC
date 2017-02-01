package com.hogar.system_comedor.controller;

import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hogar.system_comedor.dominio.Cliente;
import com.hogar.system_comedor.service.IClienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private IClienteService iClienteService;
	
	@RequestMapping(value = "/registrarCliente" , method = RequestMethod.GET)
	public String registrarCliente(HttpServletRequest request , HttpSession session){
		Cliente cliente = new Cliente();
		cliente.setCodigoCliente("AB567237#");
		cliente.setFechaRegistro(new Date());
		cliente.setNombreCliente("Anthony");
		Long idCliente = iClienteService.registrarCliente(cliente);
		return "";
	}

}
