package com.mx.ProyectoCinepolis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.ProyectoCinepolis.model.Peliculas;
import com.mx.ProyectoCinepolis.service.ClienteServImplementacion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController // 
@RequestMapping(path = "PeliculasWebService")
@CrossOrigin
public class PeliculasWebService 
{
	//Aqui van las peticiones
	
	@Autowired
	ClienteServImplementacion imp;
	
	//URL
	//http://localhost:9000/PeliculasWebService/listar
	//Peticion GET para listar
	@GetMapping(path = "listar")
	public List<Peliculas> listar()
	{
		return imp.listar();
	}
	
	//http://localhost:9000/PeliculasWebService/guardar
	@PostMapping(path = "guardar")
	public void guardar(@RequestBody Peliculas pelicula)
	{
		imp.guardar(pelicula);
	}
	
}
