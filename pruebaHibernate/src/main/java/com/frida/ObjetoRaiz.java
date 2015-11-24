package com.frida;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="objetoRaiz", 
propOrder={
		"hijo",
		"propiedad"
		})
public class ObjetoRaiz {
	
	@XmlElement(name="hijo",required=true)
	protected List<Hijos> hijo;
	
	@XmlElement(required=true)
	protected String propiedad;
	
		
	
	public List<Hijos> getHijo() {
		return hijo;
	}

	public void setHijo(List<Hijos> hijo) {
		this.hijo = hijo;
	}

	public String getPropiedad() {
		return propiedad;
	}

	public void setPropiedad(String propiedad) {
		this.propiedad = propiedad;
	}


	
	
	
}
