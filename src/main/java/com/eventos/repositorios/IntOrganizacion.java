package com.eventos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventos.modelo.Tbl_Organizacion;

public interface IntOrganizacion extends JpaRepository<Tbl_Organizacion, Integer>{
	
//	public void guardarDatosOrganizacion();

} // Fin de la interface IntOrganizacion
