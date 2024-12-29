package com.mx.ProyectoCinepolis.service;

import java.util.List;

import com.mx.ProyectoCinepolis.model.Peliculas;

public interface PeliculasService 
{
	public List<Peliculas> listar();
	public void guardar(Peliculas pelicula);
	public Peliculas buscar(int idPelicula);
	public void editar(Peliculas pelicula);
	public void eliminar(int idPelicula);	
}
