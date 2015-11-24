package com.frida;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="hijos",propOrder={"nombre","apellido","nieto"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Hijos {
	@XmlElement(required=true)
	protected String nombre;
	@XmlElement(required=true)
	protected String apellido;
	
	@XmlElement(required=true)
	protected List<Nietos> nieto;

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public List<Nietos> getNieto() {
		return nieto;
	}
	public void setNieto(List<Nietos> nieto) {
		this.nieto = nieto;
	}
	
		
	
}
