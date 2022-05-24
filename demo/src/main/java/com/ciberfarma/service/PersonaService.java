package com.ciberfarma.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciberfarma.interfaces.IPersona;
import com.ciberfarma.interfacesService.InterfazPersonaService;
import com.ciberfarma.modelo.Persona;
@Service
public class PersonaService implements InterfazPersonaService {
	@Autowired
	private IPersona data;

	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		return (List<Persona>)data.findAll();	}

	@Override
	public Optional<IPersona> listar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(IPersona p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}

	
}
