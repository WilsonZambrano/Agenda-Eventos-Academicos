package com.eventos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventos.modelo.Tbl_Expositor;


public interface IntExpositor extends  JpaRepository<Tbl_Expositor, Integer>  {

}
