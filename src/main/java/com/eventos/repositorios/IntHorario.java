package com.eventos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventos.modelo.Tbl_Horario;

public interface IntHorario extends JpaRepository<Tbl_Horario, Integer>{

}
