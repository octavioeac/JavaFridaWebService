package com.frida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="nuevoObjetoResponse",namespace="http://www.springwssample.org/types")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="",propOrder={"raiz"})
public class NuevoObjetoResponse {

	@XmlElement(name="raiz", required=true)
	protected ObjetoRaiz raiz;

	public ObjetoRaiz getRaiz() {
		return raiz;
	}

	public void setRaiz(ObjetoRaiz raiz) {
		this.raiz = raiz;
	}
	
	
	
}
