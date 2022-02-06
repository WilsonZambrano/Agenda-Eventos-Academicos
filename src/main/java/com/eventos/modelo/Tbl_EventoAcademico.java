package com.eventos.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tbl_EventoAcademico {
	
	@Id
	private int id_evento_Academico;
	
	@Column(name = "nombre", length = 120 )
	private String nombre;
	@Column(name = "temaCentral", length = 120 )
	private String temaCentral;
	@Column(name = "provincia", length = 120 )
	private String provincia;
	@Column(name = "ciudad", length = 120 )
	private String ciudad;
	@Column(name = "id_organizacion")
	private int id_organizacion;
	
	
	public int getId_evento_Academico() {
		return id_evento_Academico;
	}
	public void setId_evento_Academico(int id_evento_Academico) {
		this.id_evento_Academico = id_evento_Academico;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTemaCentral() {
		return temaCentral;
	}
	public void setTemaCentral(String temaCentral) {
		this.temaCentral = temaCentral;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public int getId_organizacion() {
		return id_organizacion;
	}
	public void setId_organizacion(int id_organizacion) {
		this.id_organizacion = id_organizacion;
	}
	
	
}
