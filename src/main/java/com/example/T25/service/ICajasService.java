package com.example.T25.service;

import java.util.List;

import com.example.T25.dto.Cajas;

public interface ICajasService {

	//Metodos del CRUD
	
	public List<Cajas> listarCajas(); //Listar All 
	
	public Cajas crearCaja(Cajas cajas);	//CREATE
	
	public Cajas leerCaja(String numero_referencia); // READ
		
	public Cajas actualizarCaja(Cajas caja); // UPDATE
	
	public void borrarCaja(String numero_referencia);// DELETE
	
	
}