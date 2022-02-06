package com.eventos.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tbl_Organizacion {
	
	@Id
	private int id_organizacion;
	
	@Column(name = "nombre_organizacion", length = 120)
	private String nombre_organizacion;
	
	@Column(name="telefono_organizacion", length = 120)
	private String telefono_organizacion;

	public int getId_organizacion() {
		return id_organizacion;
	}

	public void setId_organizacion(int id_organizacion) {
		this.id_organizacion = id_organizacion;
	}

	public String getNombre_organizacion() {
		return nombre_organizacion;
	}

	public void setNombre_organizacion(String nombre_organizacion) {
		this.nombre_organizacion = nombre_organizacion;
	}

	public String getTelefono_organizacion() {
		return telefono_organizacion;
	}

	public void setTelefono_organizacion(String telefono_organizacion) {
		this.telefono_organizacion = telefono_organizacion;
	}

} // Fin del modelo Organizacion