package com.frida.singleton.sender;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class generadorFecha {
	
	
	public String gener(){
		String cadena_aleatoria=null;
		parametroFecha fe=new parametroFecha();
		Calendar fecha = new GregorianCalendar();
		fe.setAño(fecha.get(Calendar.YEAR));
		fe.setDia(fecha.get(Calendar.DAY_OF_MONTH));
		fe.setMes(fecha.get(Calendar.MONTH));
		fe.setHora(fecha.get(Calendar.HOUR_OF_DAY));
		fe.setMinuto(fecha.get(Calendar.MINUTE));
		fe.setSegundo(fecha.get(Calendar.SECOND));
		cadena_aleatoria=fe.getAño()+fe.getMes()+fe.getDia()+fe.getHora()+fe.getMinuto()+fe.getSegundo();
	System.out.println(fe.getAño()+fe.getMes()+fe.getDia()+fe.getHora()+fe.getMinuto()+fe.getSegundo()+getCadenaAlfanumAleatoria(15));
			return cadena_aleatoria;
		
		
		
	} 


      public static String getCadenaAlfanumAleatoria (int longitud){
String cadenaAleatoria = "";
long milis = new java.util.GregorianCalendar().getTimeInMillis();
Random r = new Random(milis);
int i = 0;
while ( i < longitud){
char c = (char)r.nextInt(255);
if ( (c >= '0' && c <='9') || (c >='A' && c <='Z') ){
cadenaAleatoria += c;
i ++;
}
}
return cadenaAleatoria;
}

}