package com.mx.ProyectoCinepolis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.ProyectoCinepolis.dao.PeliculasDao;
import com.mx.ProyectoCinepolis.model.Peliculas;



@Service
public class ClienteServImplementacion implements PeliculasService
{
	//Inyeccion de dependencias
	
	@Autowired
	PeliculasDao dao;
	
	@Transactional(readOnly = true)
	@Override
	public List<Peliculas> listar() 
	{
		return dao.findAll();
	}

	@Transactional
	@Override
	public void guardar(Peliculas pelicula) 
	{
		dao.save(pelicula);
	}
	
	@Transactional
	@Override
	public Peliculas buscar(int idPelicula) 
	{
		return null;
	}

	@Transactional
	@Override
	public void editar(Peliculas pelicula) 
	{
		
	}

	@Override
	public void eliminar(int idPelicula) 
	{
		
	}

}
