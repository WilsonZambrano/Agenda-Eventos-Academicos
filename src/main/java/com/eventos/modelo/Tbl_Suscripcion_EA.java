package com.eventos.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tbl_Suscripcion_EA {

	@Id
	private int suscripcion_EA;
	@Column(name = "tbl_Suscripcion_EA",length = 45)
	private String tbl_Suscripcion_EA;
	@Column(name = "id_evento_academico")
	private int id_evento_academico;
	@Column(name = "id_horario")
	private int id_horario;
	public int getSuscripcion_EA() {
		return suscripcion_EA;
	}
	public void setSuscripcion_EA(int suscripcion_EA) {
		this.suscripcion_EA = suscripcion_EA;
	}
	public String getTbl_Suscripcion_EA() {
		return tbl_Suscripcion_EA;
	}
	public void setTbl_Suscripcion_EA(String tbl_Suscripcion_EA) {
		this.tbl_Suscripcion_EA = tbl_Suscripcion_EA;
	}
	public int getId_evento_academico() {
		return id_evento_academico;
	}
	public void setId_evento_academico(int id_evento_academico) {
		this.id_evento_academico = id_evento_academico;
	}
	public int getId_horario() {
		return id_horario;
	}
	public void setId_horario(int id_horario) {
		this.id_horario = id_horario;
	}
	
	
}
