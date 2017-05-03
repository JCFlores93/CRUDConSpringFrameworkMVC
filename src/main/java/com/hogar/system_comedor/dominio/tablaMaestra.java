package com.hogar.system_comedor.dominio;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name="TABLA_MAESTRA")
public class tablaMaestra implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQ_TABLA_MAESTRA")
	@SequenceGenerator(name = "SEQ_TABLA_MAESTRA" , sequenceName="SEQ_TABLA_MAESTRA")
	public Long ID;
	
	@Column(name="CODIGO")
	public String codigo;
	
	@Column(name="DESCRIPCION")
	public String descripcion;
	
	@Column(name="DOMINIO")
	public String dominio;
	
	
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDominio() {
		return dominio;
	}
	public void setDominio(String dominio) {
		this.dominio = dominio;
	}

}
