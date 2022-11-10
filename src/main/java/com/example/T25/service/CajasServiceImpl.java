package com.example.T25.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.T25.dao.ICajasDAO;
import com.example.T25.dto.Cajas;

@Service
public class CajasServiceImpl implements ICajasService{
	
	//Utilizamos los metodos de la interface ICajaDAO, es como si instanciaramos.
	@Autowired
	ICajasDAO iCajaDAO;
	
	@Override
	public List<Cajas> listarCajas() {
		return iCajaDAO.findAll();
	}
	
	@Override
	public Cajas crearCaja(Cajas empleado) {
		return iCajaDAO.save(empleado);
	}

	@Override
	public Cajas leerCaja(String numero_referencia) {
		return iCajaDAO.findById(numero_referencia).get();
	}


	@Override
	public Cajas actualizarCaja(Cajas empleado) {
		return iCajaDAO.save(empleado);
	}

	@Override
	public void borrarCaja(String numero_referencia) {
		iCajaDAO.deleteById(numero_referencia);
	}

}
