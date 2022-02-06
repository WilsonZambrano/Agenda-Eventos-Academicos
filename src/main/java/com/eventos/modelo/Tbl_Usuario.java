package com.eventos.modelo;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tbl_Usuario {

	@Id
	private int id_usuario;
	
	@Column(name = "nombreUsuario", length = 120)
	private String nombreUsuario;
	
	@Column(name = "contrasenia")
	private BigInteger  contrasenia;

	@Column(name = "id_persona")
	private int id_persona;

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public BigInteger getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(BigInteger contrasenia) {
		this.contrasenia = contrasenia;
	}

	public int getId_persona() {
		return id_persona;
	}

	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}
	
	
	
}
