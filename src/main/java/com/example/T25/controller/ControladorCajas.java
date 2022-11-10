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

import com.example.T25.dto.Cajas;
import com.example.T25.service.CajasServiceImpl;

@RestController
@RequestMapping("/api")
public class ControladorCajas {
	
	@Autowired
	CajasServiceImpl cajasServiceImpl;
	
	@GetMapping("/cajas")
	public List<Cajas> listarCajas(){
		return cajasServiceImpl.listarCajas();
	}
	
	@PostMapping("/cajas")
	public Cajas crearCaja(@RequestBody Cajas caja) {
		
		return cajasServiceImpl.crearCaja(caja);
		
	}
	
	
	@GetMapping("/cajas/{numero_referencia}")
	public Cajas leerCaja(@PathVariable(name="numero_referencia") String numero_referencia) {
		
		Cajas caja= new Cajas();
		
		caja=cajasServiceImpl.leerCaja(numero_referencia);
		
		System.out.println("Caja segun numero_referencia: "+caja);
		
		return caja;
	}
	
	@PutMapping("/cajas/{numero_referencia}")
	public Cajas actualizarCaja(@PathVariable(name="numero_referencia")String numero_referencia,@RequestBody Cajas caja) {
		
		Cajas caja_seleccionado= new Cajas();
		Cajas caja_actualizado= new Cajas();
		
		caja_seleccionado= cajasServiceImpl.leerCaja(numero_referencia);

		caja_seleccionado.setContenido(caja.getContenido());
		caja_seleccionado.setValor(caja.getValor());
		caja_seleccionado.setAlmacen_id(caja.getAlmacen_id());
		
		caja_actualizado = cajasServiceImpl.actualizarCaja(caja_seleccionado);
		
		System.out.println("El caja actualizado es: "+ caja_actualizado);
		
		return caja_actualizado;
	}
	
	@DeleteMapping("/cajas/{numero_referencia}")
	public void borrarCaja(@PathVariable(name="numero_referencia")String numero_referencia) {
		cajasServiceImpl.borrarCaja(numero_referencia);
	}
	
	
}
