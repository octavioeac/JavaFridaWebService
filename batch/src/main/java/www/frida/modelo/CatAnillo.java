package www.frida.modelo;

import java.sql.Date;

public class CatAnillo {
	
	private String idNodo;	
	private String movimiento;
	private String clliCentral;         	
	private String ubiNodoAdm;    	
	private String clliEquipo;                	
	private String anillo;	
	private String repadmConxadsl;      	
	private String division;	
	private String tipoCluster;         	
	private String ospf; 	
	private String repisa; 	
	private String ipSistema;	
	private String ipGestion;	
	private String estatusCns;                 	
	private Date fechaEstatusCns;             	
	private String numOtFrida;                	
	private String observaciones;              	
	private String versionNodo;                	
	private String switchRcdt;	
	private String ptoRcdt; 	
	private Date fechaAlta;	
	private String proveedorTx;

	public CatAnillo(){}

	public CatAnillo(String idNodo, String movimiento, String clliCentral,
			String ubiNodoAdm, String clliEquipo, String anillo,
			String repadmConxadsl, String division, String tipoCluster,
			String ospf, String repisa, String ipSistema, String ipGestion,
			String estatusCns, Date fechaEstatusCns, String numOtFrida,
			String observaciones, String versionNodo, String switchRcdt,
			String ptoRcdt, Date fechaAlta, String proveedorTx) {
		super();
		this.idNodo = idNodo;
		this.movimiento = movimiento;
		this.clliCentral = clliCentral;
		this.ubiNodoAdm = ubiNodoAdm;
		this.clliEquipo = clliEquipo;
		this.anillo = anillo;
		this.repadmConxadsl = repadmConxadsl;
		this.division = division;
		this.tipoCluster = tipoCluster;
		this.ospf = ospf;
		this.repisa = repisa;
		this.ipSistema = ipSistema;
		this.ipGestion = ipGestion;
		this.estatusCns = estatusCns;
		this.fechaEstatusCns = fechaEstatusCns;
		this.numOtFrida = numOtFrida;
		this.observaciones = observaciones;
		this.versionNodo = versionNodo;
		this.switchRcdt = switchRcdt;
		this.ptoRcdt = ptoRcdt;
		this.fechaAlta = fechaAlta;
		this.proveedorTx = proveedorTx;
	}

	public String getIdNodo() {
		return idNodo;
	}

	public void setIdNodo(String idNodo) {
		this.idNodo = idNodo;
	}

	public String getClliCentral() {
		return clliCentral;
	}

	public void setClliCentral(String clliCentral) {
		this.clliCentral = clliCentral;
	}

	public String getUbiNodoAdm() {
		return ubiNodoAdm;
	}

	public void setUbiNodoAdm(String ubiNodoAdm) {
		this.ubiNodoAdm = ubiNodoAdm;
	}

	public String getClliEquipo() {
		return clliEquipo;
	}

	public void setClliEquipo(String clliEquipo) {
		this.clliEquipo = clliEquipo;
	}

	public String getAnillo() {
		return anillo;
	}

	public void setAnillo(String anillo) {
		this.anillo = anillo;
	}

	public String getRepadmConxadsl() {
		return repadmConxadsl;
	}

	public void setRepadmConxadsl(String repadmConxadsl) {
		this.repadmConxadsl = repadmConxadsl;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getTipoCluster() {
		return tipoCluster;
	}

	public void setTipoCluster(String tipoCluster) {
		this.tipoCluster = tipoCluster;
	}

	public String getOspf() {
		return ospf;
	}

	public void setOspf(String ospf) {
		this.ospf = ospf;
	}

	public String getRepisa() {
		return repisa;
	}

	public void setRepisa(String repisa) {
		this.repisa = repisa;
	}

	public String getIpSistema() {
		return ipSistema;
	}

	public void setIpSistema(String ipSistema) {
		this.ipSistema = ipSistema;
	}

	public String getIpGestion() {
		return ipGestion;
	}

	public void setIpGestion(String ipGestion) {
		this.ipGestion = ipGestion;
	}

	public String getEstatusCns() {
		return estatusCns;
	}

	public void setEstatusCns(String estatusCns) {
		this.estatusCns = estatusCns;
	}

	public Date getFechaEstatusCns() {
		return fechaEstatusCns;
	}

	public void setFechaEstatusCns(Date fechaEstatusCns) {
		this.fechaEstatusCns = fechaEstatusCns;
	}

	public String getNumOtFrida() {
		return numOtFrida;
	}

	public void setNumOtFrida(String numOtFrida) {
		this.numOtFrida = numOtFrida;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getVersionNodo() {
		return versionNodo;
	}

	public void setVersionNodo(String versionNodo) {
		this.versionNodo = versionNodo;
	}

	public String getSwitchRcdt() {
		return switchRcdt;
	}

	public void setSwitchRcdt(String switchRcdt) {
		this.switchRcdt = switchRcdt;
	}

	public String getPtoRcdt() {
		return ptoRcdt;
	}

	public void setPtoRcdt(String ptoRcdt) {
		this.ptoRcdt = ptoRcdt;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fecha_alta) {
		this.fechaAlta = fecha_alta;
	}

	public String getProveedorTx() {
		return proveedorTx;
	}

	public void setProveedorTx(String proveedorTx) {
		this.proveedorTx = proveedorTx;
	}	

	public String getMovimiento() {
		return movimiento;
	}

	public void setMovimiento(String movimiento) {
		this.movimiento = movimiento;
	}
	
	
}
