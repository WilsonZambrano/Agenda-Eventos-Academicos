package com.eventos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventos.modelo.Tbl_Periodo;

public interface IntPeriodo extends JpaRepository<Tbl_Periodo, Integer> {

}
