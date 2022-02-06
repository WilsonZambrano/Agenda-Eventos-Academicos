package com.eventos.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.mysql.cj.jdbc.Blob;

@Entity
public class Tbl_Documentacion {

	@Id
	private int id_documento;
	@Column(name = "nombre_Documento", length = 120)
	private String nombre_Documento;
	@Column(name = "archivo_Documento")
	private byte[] archivo_Documento;
	public int getId_documento() {
		return id_documento;
	}
	public void setId_documento(int id_documento) {
		this.id_documento = id_documento;
	}
	public String getNombre_Documento() {
		return nombre_Documento;
	}
	public void setNombre_Documento(String nombre_Documento) {
		this.nombre_Documento = nombre_Documento;
	}
	public byte[] getArchivo_Documento() {
		return archivo_Documento;
	}
	public void setArchivo_Documento(byte[] archivo_Documento) {
		this.archivo_Documento = archivo_Documento;
	}

	
}
