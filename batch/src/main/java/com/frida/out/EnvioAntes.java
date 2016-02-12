package com.frida.out;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;





public class EnvioAntes {
	
	String mensage;

	public String getMensage() {
		return mensage;
	}

	public void setMensage(String mensage) {
		this.mensage = mensage;
	}
	
	
	@PostConstruct
	public void initIt()throws Exception{
System.out.println("!BIenvenidos SPRING");
	}
	

	@PreDestroy
	public void cleanUp()throws Exception{
		System.out.println("Ahí se ven");
	}
	
}
