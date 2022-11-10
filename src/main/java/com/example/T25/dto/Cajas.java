package com.example.T25.dto;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="cajas")

public class Cajas {

	//Atributos de la entidad Empleado
	@Id
	private String numero_referencia;
	private String contenido;
	private int valor;
	
	@ManyToOne
	@JoinColumn(name="almacen_id")
	private Almacenes almacen_id;
	
	//Constructores
	
	public Cajas() {
		
	}
	
	public Cajas(String numero_referencia, String contenido, int valor , Almacenes almacen_id) {
		this.numero_referencia=numero_referencia;
		this.contenido=contenido;
		this.valor=valor;
		this.almacen_id=almacen_id;
		
	}


	public String getNumero_referencia() {
		return numero_referencia;
	}

	public void setNumero_referencia(String numero_referencia) {
		this.numero_referencia = numero_referencia;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Almacenes getAlmacen_id() {
		return almacen_id;
	}

	public void setAlmacen_id(Almacenes almacen_id) {
		this.almacen_id = almacen_id;
	}
	

	//To string personalizado
	@Override
	public String toString() {
		return "Cajas [numero referencia = " + numero_referencia +", contenido = " + contenido +", valor " + valor + ", almacen id " + almacen_id + " ] ";
	}
}
