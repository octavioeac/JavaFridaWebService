package com.frida.xmlPojo;

import java.sql.Date;

public class PeEquipoXml {

	 private String ID_Nodo;
     private String ID_Nodo_Nuevo;
     private String Movimiento;
     private String CLLIEdificio;
     private String UbicacionEquipo;
     private String CLLI ;
     private String Cluster;
     private String Modelo;
     private String Division;
     private String CLEI;
     private String TipoNodoTelmex;
     private String OSPF;
     private String Repisa;
     private String IPSistema;
     private String IPGestion;
     private String EstadoAprovisionamiento;
     private Date FechaGestion;
     private String FolioOrdenTrabajo;
     private String Notas;
     private String VersionSistemaOperativo;
     private String TipoGestion;
     private String VLANGestion;
     private String ConexionPorTunel;
     private String SwitchRCDT;
     private String PuertoRCDT;
     private String Velocidad;
     private String FolioRCDT;
     private String PEP_Element_ID;
     private String FechaBaja;
     private Date FechaAlta;
     private String FechaCambio;
     private String Proveedor;
     
	public String getID_Nodo() {
		return ID_Nodo;
	}
	public void setID_Nodo(String iD_Nodo) {
		
		ID_Nodo = iD_Nodo;
	}
	public String getID_Nodo_Nuevo() {
		return ID_Nodo_Nuevo;
	}
	
	public void setID_Nodo_Nuevo(String iD_Nodo_Nuevo) {
		if(iD_Nodo_Nuevo!=""){
		ID_Nodo_Nuevo = iD_Nodo_Nuevo;
		}
		else{
			ID_Nodo_Nuevo="";	
		}
	}
	public String getMovimiento() {
		return Movimiento;
	}
	
	public void setMovimiento(String movimiento) {
		if(movimiento!=null){
			Movimiento = movimiento;
		}
		else{
		Movimiento="";
		}
		
	}
	public String getCLLIEdificio() {
		return CLLIEdificio;
	}
	public void setCLLIEdificio(String cLLIEdificio) {
		if(cLLIEdificio!=null){
			CLLIEdificio = cLLIEdificio;	
		}
		else{
		cLLIEdificio="";
		}
		
	}
	public String getUbicacionEquipo() {
		return UbicacionEquipo;
	}
	public void setUbicacionEquipo(String ubicacionEquipo) {
		if(ubicacionEquipo!=null){
			UbicacionEquipo = ubicacionEquipo;	
		}
		else{
		UbicacionEquipo="";
		}

		
	}
	public String getCLLI() {
		return CLLI;
	}
	public void setCLLI(String cLLI) {
		if(cLLI!=null){
			CLLI = cLLI;	
		}
		else{
			CLLI="";
		}
		
	}
	public String getCluster() {
		return Cluster;
	}
	public void setCluster(String cluster) {
		if(cluster!=null){
			Cluster = cluster;	
		}
		else{
			Cluster="";
		}
		
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		if(modelo!=null){
			Modelo = modelo;
		}
		else{
		Modelo="";
		}
		
	}
	public String getDivision() {
		return Division;
	}
	public void setDivision(String division) {
		if(division!=null){
			Division = division;	
		}
		else{
		Division="";
		}
		
	}
	public String getCLEI() {
		return CLEI;
	}
	public void setCLEI(String cLEI) {
		if(cLEI!=null){
			CLEI = cLEI;
		}
		else{
		CLEI="";
		}
		
	}
	public String getTipoNodoTelmex() {
		return TipoNodoTelmex;
	}
	public void setTipoNodoTelmex(String tipoNodoTelmex) {
		if(tipoNodoTelmex!=null){
			TipoNodoTelmex = tipoNodoTelmex;	
		}
		else{
		TipoNodoTelmex="";
		}
		
	}
	public String getOSPF() {
		return OSPF;
	}
	public void setOSPF(String oSPF) {
		if(oSPF!=null){
			OSPF = oSPF;
		}
		else{
			OSPF="";
		}
		
	}
	public String getRepisa() {
		return Repisa;
	}
	public void setRepisa(String repisa) {
		if(repisa!=null){
			Repisa = repisa;	
		}
		else{
		Repisa ="";
		}
		
	}
	public String getIPSistema() {
		return IPSistema;
	}
	public void setIPSistema(String iPSistema) {
		if(iPSistema!=null){
			IPSistema = iPSistema;			
		}
		else{
		IPSistema="";
		}

	}
	public String getIPGestion() {
		return IPGestion;
	}
	public void setIPGestion(String iPGestion) {
		if(iPGestion!=null){
			IPGestion = iPGestion;	
		}
		else{
		IPGestion="";
		}
		
	}
	public String getEstadoAprovisionamiento() {
		return EstadoAprovisionamiento;
	}
	
	public void setEstadoAprovisionamiento(String estadoAprovisionamiento) {
		if(estadoAprovisionamiento!=null){
			EstadoAprovisionamiento = estadoAprovisionamiento;	
		}
		else{
		EstadoAprovisionamiento="";
		}
		
	}
	public Date getFechaGestion() {
		return FechaGestion;
	}
	public void setFechaGestion(Date date) {
		
			FechaGestion = date;	
		
		
	}
	public String getFolioOrdenTrabajo() {
		return FolioOrdenTrabajo;
	}
	public void setFolioOrdenTrabajo(String folioOrdenTrabajo) {
		if(folioOrdenTrabajo!=null){
			FolioOrdenTrabajo = folioOrdenTrabajo;	
		}
		else{
			FolioOrdenTrabajo="";
		}

		
	}
	public String getNotas() {
		return Notas;
	}
	public void setNotas(String notas) {
		if(notas!=null){
			Notas = notas;	
		}
		else{
		Notas="";
		}
		
	}
	public String getVersionSistemaOperativo() {
		return VersionSistemaOperativo;
	}
	public void setVersionSistemaOperativo(String versionSistemaOperativo) {
		if(versionSistemaOperativo!=null){
			VersionSistemaOperativo = versionSistemaOperativo;
		}
		else{
		VersionSistemaOperativo="";
		}
		
	}
	public String getTipoGestion() {
		return TipoGestion;
	}
	public void setTipoGestion(String tipoGestion) {
		if(tipoGestion!=null){
			TipoGestion = tipoGestion;			
		}
		else{
		TipoGestion="";
		}

	}
	public String getVLANGestion() {
		return VLANGestion;
	}
	public void setVLANGestion(String vLANGestion) {
		if(vLANGestion!=null){
			VLANGestion = vLANGestion;	
		}
		else{
		VLANGestion="";
		}
		
	}
	public String getConexionPorTunel() {
		return ConexionPorTunel;
	}
	public void setConexionPorTunel(String conexionPorTunel) {
		if(conexionPorTunel!=null){
			ConexionPorTunel = conexionPorTunel;		
		}
		else{
		ConexionPorTunel="";
		}
	
	}
	public String getSwitchRCDT() {
		return SwitchRCDT;
	}
	public void setSwitchRCDT(String switchRCDT) {
		if(switchRCDT!=null){
			
			SwitchRCDT = switchRCDT;	
		}
		else{
			SwitchRCDT="";
		}
		
	}
	public String getPuertoRCDT() {
		return PuertoRCDT;
	}
	public void setPuertoRCDT(String puertoRCDT) {
		if(puertoRCDT!=null){
			PuertoRCDT = puertoRCDT;	
		}
		else{
		PuertoRCDT="";
		}
		
	}
	public String getVelocidad() {
		return Velocidad;
	}
	public void setVelocidad(String velocidad) {
		if(velocidad!=null){
			Velocidad = velocidad;	
		}
		else{
		Velocidad="";
		}
		
	}
	public String getFolioRCDT() {
		return FolioRCDT;
	}
	public void setFolioRCDT(String folioRCDT) {
		if(folioRCDT!=null){
			FolioRCDT = folioRCDT;	
		}
		else{
		FolioRCDT="";
		}
		
	}
	public String getPEP_Element_ID() {
		return PEP_Element_ID;
	}
	public void setPEP_Element_ID(String pEP_Element_ID) {
		if(pEP_Element_ID!=null){
			PEP_Element_ID = pEP_Element_ID;	
		}
		else{
		PEP_Element_ID="";
		}
			}
	public String getFechaBaja() {
		return FechaBaja;
	}
	
	public void setFechaBaja(String fechaBaja) {
		if(fechaBaja!=null){
			FechaBaja = fechaBaja;	
		}
		else{
		FechaBaja="";
		}
		
	}
	public Date getFechaAlta() {
		return FechaAlta;
	}
	public void setFechaAlta(Date date) {
		
			FechaAlta = date;
		

			}
	public String getFechaCambio() {
		return FechaCambio;
	}
	public void setFechaCambio(String fechaCambio) {
		if(fechaCambio!=null){
			FechaCambio = fechaCambio;	
		}
		else{
			FechaCambio="";
		}
		
	}
	public String getProveedor() {
		return Proveedor;
	}
	public void setProveedor(String proveedor) {
		if(proveedor!=null){
			Proveedor = proveedor;	
		}
		else{
			Proveedor="";
		}

		
	}

     
	
     
}
