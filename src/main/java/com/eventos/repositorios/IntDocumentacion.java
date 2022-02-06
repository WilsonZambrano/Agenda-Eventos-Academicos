package com.eventos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventos.modelo.Tbl_Documentacion;

public interface IntDocumentacion extends JpaRepository<Tbl_Documentacion, Integer> {

}
