package com.eventos.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tbl_Charla {

	@Id
	private int id_charla;
	
	@Column(name = "resumencharla", length = 1000)
	private String resumencharla;
	
}
