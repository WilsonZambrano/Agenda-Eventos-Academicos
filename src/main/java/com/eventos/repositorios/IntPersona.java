package com.eventos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventos.modelo.Tbl_Persona;

public interface IntPersona extends JpaRepository<Tbl_Persona, Integer> {

}
