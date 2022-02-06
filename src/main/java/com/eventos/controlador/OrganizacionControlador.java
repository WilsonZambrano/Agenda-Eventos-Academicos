package com.eventos.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.eventos.modelo.Tbl_Organizacion;
import com.eventos.repositorios.IntOrganizacion;

@Controller
public class OrganizacionControlador{
	
	@Autowired
	private IntOrganizacion organizacion;
	
	Tbl_Organizacion org = new Tbl_Organizacion();
	
	@GetMapping("/guardarOrganizacion")
	public void guardarDatosOrganizacion() {
		
		org.setId_organizacion(1);
		org.setNombre_organizacion("UPS");
		org.setTelefono_organizacion("072895623");
		
		organizacion.save(org);
	}// Fin de la funcion guardarDatosOrganizacion

} // Fin de la clase controlador del modelo organizacion
