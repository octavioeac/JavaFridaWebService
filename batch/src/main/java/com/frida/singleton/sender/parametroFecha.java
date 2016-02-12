package com.frida.singleton.sender;

public class parametroFecha {
public String año;
public String mes;
public String dia;
public String hora;
public String minuto;
public String segundo;
public String getAño() {
	return año;
}
public void setAño(int año) {
	String añoCast=Integer.toString(año);
	this.año = añoCast;
}
public String getMes() {
	return mes;
}
public void setMes(int mes) {
	String mesCast=Integer.toString(mes);
	this.mes = mesCast;
}
public String getDia() {
	return dia;
}
public void setDia(int dia) {
	String diaCast=Integer.toString(dia);
	this.dia = diaCast;
}
public String getHora() {
	return hora;
}
public void setHora(int hora) {
	String horaCast=Integer.toString(hora);
	this.hora = horaCast;
}
public String getMinuto() {
	return minuto;
}
public void setMinuto(int minuto) {
	String minutoCast=Integer.toString(minuto);
	this.minuto = minutoCast;
}
public String getSegundo() {
	return segundo;
}
public void setSegundo(int segundo) {
	String segundoCast=Integer.toString(segundo);
	this.segundo = segundoCast;
}

	
}
