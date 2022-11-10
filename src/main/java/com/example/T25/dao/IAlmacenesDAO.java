package com.example.T25.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.T25.dto.Almacenes;


public interface IAlmacenesDAO extends JpaRepository<Almacenes, Long>{
	
}
