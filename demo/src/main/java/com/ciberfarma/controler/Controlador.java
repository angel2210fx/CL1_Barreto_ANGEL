package com.ciberfarma.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ciberfarma.interfacesService.InterfazPersonaService;
import com.ciberfarma.modelo.Persona;

@Controller
@RequestMapping
public class Controlador {
	@Autowired
	private InterfazPersonaService service;

	@GetMapping("/listar")
	public String listar(Model model) {
		List<Persona> personas = service.listar();
		model.addAttribute("personas", personas);
		return "listado";
	}
	@GetMapping("/eliminar/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listar";
	}
}
