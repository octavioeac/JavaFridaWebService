package www.frida.modelo;

public class admfridaarm {
	
	private int Id;
	private String idOtTrabajo;
	private String nomElement;
	private String idElementoArm;
	private String estatuArm;
	private String estatusCns;
	
	
	
	public admfridaarm(int id, String idOtTrabajo, String nomElement, String idElementoArm, String estatuArm,
			String estatusCns) {
		super();
		Id = id;
		this.idOtTrabajo = idOtTrabajo;
		this.nomElement = nomElement;
		this.idElementoArm = idElementoArm;
		this.estatuArm = estatuArm;
		this.estatusCns = estatusCns;
	}


	public admfridaarm() {
	
	} 
		
	
	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}
	
	public String getIdOtTrabajo() {
		return idOtTrabajo;
	}
	public void setIdOtTrabajo(String idOtTrabajo) {
		this.idOtTrabajo = idOtTrabajo;
	}
	public String getNomElement() {
		return nomElement;
	}
	public void setNomElement(String nomElement) {
		this.nomElement = nomElement;
	}
	public String getIdElementoArm() {
		return idElementoArm;
	}
	public void setIdElementoArm(String idElementoArm) {
		this.idElementoArm = idElementoArm;
	}
	public String getEstatuArm() {
		return estatuArm;
	}
	public void setEstatuArm(String estatuArm) {
		this.estatuArm = estatuArm;
	}
	public String getEstatusCns() {
		return estatusCns;
	}
	public void setEstatusCns(String estatusCns) {
		this.estatusCns = estatusCns;
	}
	
	
}
