package com.example.T25.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.T25.dao.IAlmacenesDAO;
import com.example.T25.dto.Almacenes;

@Service
public class AlmacenesServiceImpl implements IAlmacenesService{
	
	//Utilizamos los metodos de la interface IAlmacenDAO, es como si instanciaramos.
	@Autowired
	IAlmacenesDAO iAlmacenDAO;
	
	@Override
	public List<Almacenes> listarAlmacenes() {
		return iAlmacenDAO.findAll();
	}
	
	@Override
	public Almacenes crearAlmacen(Almacenes almacen) {
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public Almacenes leerAlmacen(Long id) {
		return iAlmacenDAO.findById(id).get();
	}


	@Override
	public Almacenes actualizarAlmacen(Almacenes almacen) {
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public void borrarAlmacen(Long id) {
		iAlmacenDAO.deleteById(id);
	}

}
