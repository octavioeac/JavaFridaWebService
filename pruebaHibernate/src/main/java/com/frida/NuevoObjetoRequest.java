package com.frida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="nuevoObjetoRequest",namespace="http://www.springwssample.org/types")
@XmlType(name="",propOrder={"gen"})
@XmlAccessorType(XmlAccessType.FIELD)
public class NuevoObjetoRequest {
	
	
	public Gente getGen() {
		return gen;
	}

	public void setGen(Gente gen) {
		this.gen = gen;
	}

	@XmlElement(required=true)
	protected Gente gen;
	
	

}
