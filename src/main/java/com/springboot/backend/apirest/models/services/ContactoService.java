package com.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.backend.apirest.models.dao.ContactoDao;
import com.springboot.backend.apirest.models.entity.Contacto;

@Service
public class ContactoService implements IContactoService {

	@Autowired
	private ContactoDao contactoDao;
	
	
	public List<Contacto> findAllContactos() {
		return contactoDao.findAllContactos();
	}

}
