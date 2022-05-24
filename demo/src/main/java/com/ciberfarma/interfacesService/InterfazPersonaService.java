package com.ciberfarma.interfacesService;

import java.util.List;
import java.util.Optional;

import com.ciberfarma.interfaces.IPersona;
import com.ciberfarma.modelo.Persona;

public interface InterfazPersonaService {
	public List<Persona> listar();
	public Optional<IPersona> listar(int id);
	public int save(IPersona p);
	
	public void delete(int id);
}
