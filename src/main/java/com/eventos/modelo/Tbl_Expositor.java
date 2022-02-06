package com.eventos.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.mysql.cj.jdbc.Blob;

@Entity
public class Tbl_Expositor {
	
	@Id
	private int id_expositor;
	
		
	@Column(name = "foto_expositor")
	private byte[] foto;


	@Column(name="id_persona")
	private int id_persona;
	
	public int getId_expositor() {
		return id_expositor;
	}

	public void setId_expositor(int id_expositor) {
		this.id_expositor = id_expositor;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public int getId_persona() {
		return id_persona;
	}

	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}
	
	
	
}
