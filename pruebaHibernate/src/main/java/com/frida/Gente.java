package com.frida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="gente",propOrder={"nombre","id","dire"})
public class Gente {

	@XmlElement(required=true)
	protected String nombre;
	
	@XmlElement(required=true)
	protected int id;
	
	@XmlElement(required=true)
	protected Direccion dire;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Direccion getDire() {
		return dire;
	}

	public void setDire(Direccion dire) {
		this.dire = dire;
	} 
	
}
