package com.ciberfarma.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ciberfarma.modelo.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer> {

}
