package com.ciberfarma.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_autores")
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String apellido;

	public Persona(int id, String name, String apellido) {
		super();
		this.id = id;
		this.name = name;
		this.apellido = apellido;
	}

	public Persona() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", name=" + name + ", apellido=" + apellido + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getApellido()=" + getApellido() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
