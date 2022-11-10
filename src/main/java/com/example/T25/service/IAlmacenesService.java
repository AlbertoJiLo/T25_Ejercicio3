package com.example.T25.service;

import java.util.List;

import com.example.T25.dto.Almacenes;

public interface IAlmacenesService {

	//Metodos del CRUD
	
	public List<Almacenes> listarAlmacenes(); //Listar All 
	
	public Almacenes crearAlmacen(Almacenes almacenes);	//CREATE
	
	public Almacenes leerAlmacen(Long id); // READ
		
	public Almacenes actualizarAlmacen(Almacenes almacen); // UPDATE
	
	public void borrarAlmacen(Long id);// DELETE
	
	
}
