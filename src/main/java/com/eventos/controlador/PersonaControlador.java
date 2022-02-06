package com.eventos.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.eventos.modelo.Tbl_Persona;
import com.eventos.repositorios.IntPersona;


public class PersonaControlador {

	@Autowired
	private IntPersona persona;
	
	Tbl_Persona per = new Tbl_Persona();

	@GetMapping("/guardarPersona")
	public void guardarDatosOrganizacion() {
		
		per.setId_persona(1);
		per.setCedula("0101010101010");
		per.setNombre("Juan");
		per.setCorreo("juan@gmail.com");
		per.setTelefono("0987898989");
		persona.save(per);
}
}
