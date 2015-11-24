package com.frida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "salud"
})
@XmlRootElement(name="getObjetoRequest", namespace="http://www.springwssample.org/types")
public class GetObjetoRequest {
	
	public Saludo getSalud() {
		return salud;
	}

	public void setSalud(Saludo salud) {
		this.salud = salud;
	}

	@XmlElement(required=true)
	protected Saludo salud;

}
