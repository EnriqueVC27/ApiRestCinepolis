package com.mx.ProyectoCinepolis.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
CREATE TABLE PELICULAS(
ID_PELICULA NUMBER PRIMARY KEY,
NOMBRE VARCHAR2(90) NOT NULL,
GENERO VARCHAR2(90) NOT NULL,
PRECIO NUMBER NOT NULL
);
 * 
 */

//Estereotipos o anotaciones, accedemos a una libreria, indica que esta clase va a pertenecer a una tabla
//

@Entity
@Table(name = "PELICULAS")
@NoArgsConstructor //Constructor vacio
@AllArgsConstructor // Constructor con todo los parametros
@Data // toString, Getters y Setters

public class Peliculas 
{
	//Colocar camps de la tabla
	@Id //Siempre se coloca para especificar llave primaria
	@Column(name = "ID_PELICULA", columnDefinition = "NUMBER", nullable = false)
	private Integer idPelicula;
	
	@Column(name = "NOMBRE", columnDefinition = "VARCHAR2(90)", nullable = false)
	private String nombre;
	
	@Column(name = "GENERO", columnDefinition = "VARCHAR2(90)", nullable = false)
	private String genero;
	
	@Column(name = "PRECIO", columnDefinition = "NUMBER", nullable = false)
	private Long precio;
	
}
