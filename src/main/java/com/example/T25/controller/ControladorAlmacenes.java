package com.example.T25.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.T25.dto.Almacenes;
import com.example.T25.service.AlmacenesServiceImpl;

@RestController
@RequestMapping("/api")
public class ControladorAlmacenes {
	
	@Autowired
	AlmacenesServiceImpl almacenesServiceImpl;
	
	@GetMapping("/almacenes")
	public List<Almacenes> listarAlmacenes(){
		return almacenesServiceImpl.listarAlmacenes();
	}
	
	@PostMapping("/almacenes")
	public Almacenes crearAlmacen(@RequestBody Almacenes almacen) {
		
		return almacenesServiceImpl.crearAlmacen(almacen);
		
	}
	
	
	@GetMapping("/almacenes/{id}")
	public Almacenes leerAlmacen(@PathVariable(name="id") Long id) {
		
		Almacenes almacen= new Almacenes();
		
		almacen=almacenesServiceImpl.leerAlmacen(id);
		
		System.out.println("Almacen segun ID: "+almacen);
		
		return almacen;
	}
	
	@PutMapping("/almacenes/{id}")
	public Almacenes actualizarAlmacen(@PathVariable(name="id")Long id,@RequestBody Almacenes almacen) {
		
		Almacenes almacen_seleccionado= new Almacenes();
		Almacenes almacen_actualizado= new Almacenes();
		
		almacen_seleccionado= almacenesServiceImpl.leerAlmacen(id);

		almacen_seleccionado.setLugar(almacen.getLugar());
		almacen_seleccionado.setCapacidad(almacen.getCapacidad());


		
		almacen_actualizado = almacenesServiceImpl.actualizarAlmacen(almacen_seleccionado);
		
		System.out.println("El almacen actualizado es: "+ almacen_actualizado);
		
		return almacen_actualizado;
	}
	
	@DeleteMapping("/almacenes/{id}")
	public void borrarAlmacen(@PathVariable(name="id")Long id) {
		almacenesServiceImpl.borrarAlmacen(id);
	}
	
	
}
