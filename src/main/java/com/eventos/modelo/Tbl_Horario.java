package com.eventos.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tbl_Horario {

	@Id
	private int horario;

	@Column(name = "horaInicioHorario",length = 5)
	private String horaInicioHorario;
	@Column(name = "horaFinHorario",length = 5)
	private String horaFinHorario;
	@Column(name = "diahorario",length = 10)
	private String diahorario;
	@Column(name = "idEventoAcadamico")
	private int idEventoAcadamico;
	public int getHorario() {
		return horario;
	}
	public void setHorario(int horario) {
		this.horario = horario;
	}
	public String getHoraInicioHorario() {
		return horaInicioHorario;
	}
	public void setHoraInicioHorario(String horaInicioHorario) {
		this.horaInicioHorario = horaInicioHorario;
	}
	public String getHoraFinHorario() {
		return horaFinHorario;
	}
	public void setHoraFinHorario(String horaFinHorario) {
		this.horaFinHorario = horaFinHorario;
	}
	public String getDiahorario() {
		return diahorario;
	}
	public void setDiahorario(String diahorario) {
		this.diahorario = diahorario;
	}
	public int getIdEventoAcadamico() {
		return idEventoAcadamico;
	}
	public void setIdEventoAcadamico(int idEventoAcadamico) {
		this.idEventoAcadamico = idEventoAcadamico;
	}
	
	
}
