package com.hogar.system_comedor.dominio;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CLIENTE")
public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID_CLIENTE")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_CLIENTES_ID_CLIENTE")
	@SequenceGenerator(name = "SEQ_CLIENTES_ID_CLIENTE" , sequenceName = "SEQ_CLIENTES_IDCLIENTES")
	public Long idCliente;
	
	@Column(name = "NOMBRE_CLIENTE")
	public String nombreCliente;
	
	@Column(name = "CODIGO_CLIENTE")
	public String codigoCliente;
	
	@Column(name = "OCUPACION_CLIENTE")
	public String ocupacionCliente;
	
	@Column(name = "TIPO_CLIENTE")
	public Long idTipoCliente;
	
	@Column(name = "CATEGORIA_CLIENTE")
	public Long idCategoriaCliente;
	
	@Column(name = "FECHA_REGISTRO_CLIENTE")
	@Temporal(TemporalType.DATE)
	public Date fechaRegistro;
	
	@Column(name = "DIRECCION_CLIENTE")
	public String direccion;
	
	@Column(name = "TELEFONO_CLIENTE")
	public String telefono;
	
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public String getOcupacionCliente() {
		return ocupacionCliente;
	}
	public void setOcupacionCliente(String ocupacionCliente) {
		this.ocupacionCliente = ocupacionCliente;
	}
	public Long getIdTipoCliente() {
		return idTipoCliente;
	}
	public void setIdTipoCliente(Long idTipoCliente) {
		this.idTipoCliente = idTipoCliente;
	}
	public Long getIdCategoriaCliente() {
		return idCategoriaCliente;
	}
	public void setIdCategoriaCliente(Long idCategoriaCliente) {
		this.idCategoriaCliente = idCategoriaCliente;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
