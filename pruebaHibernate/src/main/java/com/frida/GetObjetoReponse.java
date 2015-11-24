package com.frida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "people"
})
@XmlRootElement(name = "getObjetoReponse", namespace="http://www.springwssample.org/types")
public class GetObjetoReponse {

	
	 @XmlElement(required = true)
	protected Persona people;

	public Persona getPeople() {
		return people;
	}

	public void setPeople(Persona people) {
		this.people = people;
	}

	
	
	
}
