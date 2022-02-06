package com.eventos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventos.modelo.Tbl_Usuario;

public interface IntUsuario extends JpaRepository<Tbl_Usuario, Integer> {

}
