package com.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.backend.apirest.models.entity.Contacto;
import com.springboot.backend.apirest.models.services.ContactoService;

@RestController
@CrossOrigin(origins = { "*" })
@RequestMapping("/rest/v1/")
public class ContactosRest {

	@Autowired
	private ContactoService contactoService;

	@GetMapping("/contactos/list")
	public List<Contacto> listarContactos() {
		return contactoService.findAllContactos();
	}
}
