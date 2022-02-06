package com.eventos.modelo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tbl_Periodo {

	@Id
	private int id_perido;
	@Column(name = "nombre_periodo", length = 50)
	private String nombre_periodo;
	@Column(name = "fecha_inicio_periodo")
	private Date fecha_inicio_periodo;
	@Column(name = "fecha_fin_periodo")
	private Date fecha_fin_periodo;
	public int getId_perido() {
		return id_perido;
	}
	public void setId_perido(int id_perido) {
		this.id_perido = id_perido;
	}
	public String getNombre_periodo() {
		return nombre_periodo;
	}
	public void setNombre_periodo(String nombre_periodo) {
		this.nombre_periodo = nombre_periodo;
	}
	public Date getFecha_inicio_periodo() {
		return fecha_inicio_periodo;
	}
	public void setFecha_inicio_periodo(Date fecha_inicio_periodo) {
		this.fecha_inicio_periodo = fecha_inicio_periodo;
	}
	public Date getFecha_fin_periodo() {
		return fecha_fin_periodo;
	}
	public void setFecha_fin_periodo(Date fecha_fin_periodo) {
		this.fecha_fin_periodo = fecha_fin_periodo;
	}
	
	
	
}
