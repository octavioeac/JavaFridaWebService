package com.frida;

import java.math.BigDecimal;
import java.util.ArrayList;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


import com.websystique.spring.model.Employee;
import com.websystique.spring.service.EmployeeService;




@Endpoint
public class PruebaEndpoint {

	private static final String NAMESPACE = "http://www.springwssample.org/types";
	
	
	
	  
	  @PayloadRoot(localPart = "nuevoObjetoRequest", namespace = "http://www.springwssample.org/types")
	    @ResponsePayload
	    public NuevoObjetoResponse otroObjetoComplejo(@RequestPayload NuevoObjetoRequest request) {
		  NuevoObjetoResponse obj=new NuevoObjetoResponse();
		  
		  System.out.println("HOLA METODO_2 WEB");
		  
		  Nietos nie=new Nietos();
		  nie.setApellido("Alvarez");
		  nie.setNombre("Juan");

		  System.out.println(nie.getApellido());
		  System.out.println(nie.getNombre());
		  
		  
		  Nietos nie2=new Nietos();
		  nie2.setApellido("Alvarez");
		  nie2.setNombre("Jose");

		  System.out.println(nie2.getApellido());
		  System.out.println(nie2.getNombre());
		  
		  
		  Nietos nie3=new Nietos();
		  nie3.setApellido("Hijos");
		  nie3.setNombre("Pedro");
		  
		  System.out.println(nie3.getApellido());
		  System.out.println(nie3.getNombre());
		  
		  
		  Nietos nie4=new Nietos();
		  nie4.setApellido("Garcia");
		  nie4.setNombre("Marcos");
		  
		  System.out.println(nie4.getApellido());
		  System.out.println(nie4.getNombre());
		  
		  Nietos nie5=new Nietos();
		  nie5.setApellido("Garcia");
		  nie5.setNombre("Chagno");
		  
		  
		  List<Nietos> nietoAl=new ArrayList<Nietos>();
		  nietoAl.add(nie);
		  nietoAl.add(nie2);
		  
		  for(Nietos buclenieto : nietoAl) {
			  System.out.println(buclenieto.getNombre()+buclenieto.getApellido());
			}
		  
		  System.out.println("HOLA LISTAS");
		  
		  
		  List<Nietos> nietoGar=new ArrayList<Nietos>();
		  nietoGar.add(nie3);
		  nietoGar.add(nie4);
		  nietoGar.add(nie5);
		  
		  for(Nietos buclenieto2 : nietoGar) {
			  System.out.println(buclenieto2.getNombre()+buclenieto2.getApellido());
			}
		  
		 
		  
		  Hijos hijo1=new Hijos();
		  hijo1.setApellido("Alvarez");
		  hijo1.setNieto(nietoAl);
		  
		  Hijos hijo2=new Hijos();
		  hijo2.setApellido("Garcia");
		  hijo2.setNieto(nietoGar);
		  
		  List<Hijos> hijoList=new ArrayList<Hijos>();;
		  hijoList.add(hijo1);
		  hijoList.add(hijo2);
		  
		  ObjetoRaiz k=new ObjetoRaiz();
		  k.setHijo(hijoList);
		  k.setPropiedad("HOLA PROPIEDAD");
		  
		  NuevoObjetoResponse objetoFinal=new NuevoObjetoResponse();
		  objetoFinal.setRaiz(k);
		  
		  
		  
		  
		  return objetoFinal;
	    }
	    
	

	  
}
