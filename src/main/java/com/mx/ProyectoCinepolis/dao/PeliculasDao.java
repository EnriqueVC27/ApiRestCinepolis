package com.mx.ProyectoCinepolis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.ProyectoCinepolis.model.Peliculas;

//Intermediario entre la app y la BD
//Contiene metodos de Crud
public interface PeliculasDao extends JpaRepository<Peliculas, Integer>
{
	
}
