package com.springboot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.springboot.backend.apirest.models.entity.Contacto;
import com.springboot.backend.apirest.models.entity.Role;

public interface ContactoDao extends CrudRepository<Role, Long>{
	
	@Query("select u from Contacto u")
	public List<Contacto> findAllContactos();

}
