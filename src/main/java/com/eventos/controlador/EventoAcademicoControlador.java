package com.eventos.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.eventos.repositorios.IntEventoAcademico;

public class EventoAcademicoControlador {

	@Autowired
	private IntEventoAcademico eventoAcademico;
	
	//GetMapping("/guardarEventoAcademico")
}
