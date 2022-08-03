package com.Ibarra.ponce.pablo.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ibarra.ponce.pablo.Model.Categoria;


public interface CategoriasRepository extends JpaRepository <Categoria, Integer> {
	
}
