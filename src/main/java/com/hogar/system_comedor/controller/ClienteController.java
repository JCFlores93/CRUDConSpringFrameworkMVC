package com.hogar.system_comedor.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hogar.system_comedor.dominio.Cliente;
import com.hogar.system_comedor.service.IClienteService;
import com.hogar.system_comedor.util.Constantes;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private IClienteService iClienteService;
	
	@RequestMapping(value="/irRegistrarCliente", method=RequestMethod.GET)
	public String irRegistrarCliente(){
		return Constantes.PAGINA_REGISTRAR_CLIENTE;
	}

	@ResponseBody
	@RequestMapping(value = "/registrarCliente" , method = RequestMethod.GET,produces = "text/plain")
	public String registrarCliente(HttpServletRequest request , HttpSession session,@RequestParam("codigoCliente") String codigo,@RequestParam("nombreCliente") String nombre,@RequestParam("telefono") String telefono){
		String mensaje = "";
		Cliente cliente=new Cliente();
		cliente.setCodigoCliente(codigo);
		cliente.setNombreCliente(nombre);
		cliente.setTelefono(telefono);
		Long idCliente = iClienteService.registrarCliente(cliente);
		if(idCliente != null){
			mensaje = "Se registro correctamente el cliente";
		}else{
			mensaje = "Hubo un error en el registro del cliente";
		}
		return mensaje;
	}
	
	@RequestMapping(value = "/listarCliente" , method = RequestMethod.GET)
	public String listarCliente(HttpServletRequest request , HttpSession session){
		Cliente cliente = new Cliente();
		cliente.setIdCliente(Long.parseLong("0"));
		iClienteService.listarClientes(cliente);
		return "";
	}

}
