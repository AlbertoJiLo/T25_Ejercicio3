package com.example.T25.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="almacenes")

public class Almacenes {

	//Atributos de la entidad Empleado
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String lugar;
	private int capacidad;
	
	@OneToMany
	@JoinColumn(name="almacen_id")
	private List<Cajas> cajas;
	
	
	//Constructores
	
	public Almacenes() {
		
	}
	
	public Almacenes(Long id, String lugar, int capacidad) {
		this.id=id;
		this.lugar=lugar;
		this.capacidad=capacidad;
	}

	//Setters y getters
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "almacen_id")
	public List<Cajas> getAlmacen_id() {
		return cajas;
	}

	public void setAlmacen_id(List<Cajas> caja) {
		this.cajas = caja;
	}


	//To string personalizado
	@Override
	public String toString() {
		return "Almacenes [id = " + id +", lugar = " + lugar +", capacidad " + capacidad + " ] ";
	}
}
