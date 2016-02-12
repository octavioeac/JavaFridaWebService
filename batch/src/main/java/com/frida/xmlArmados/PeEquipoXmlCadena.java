package com.frida.xmlArmados;

import com.frida.xmlPojo.PeEquipoXml;

public class PeEquipoXmlCadena {

	public String getXmlEQUIPO(PeEquipoXml equi){
		
			String cadenaXml ="<PeEquipo>"
						+ "<ID_Nodo>"+equi.getID_Nodo()+"</ID_Nodo>"
						+ "<ID_Nodo_Nuevo>"+equi.getID_Nodo_Nuevo()+"</ID_Nodo_Nuevo>"
						+ "<Movimiento>"+equi.getMovimiento()+"</Movimiento>"
						+ "<CLLIEdificio>"+equi.getCLLIEdificio()+"</CLLIEdificio>"
						+ "<UbicacionEquipo>"+equi.getUbicacionEquipo()+"</UbicacionEquipo>"
						+ "<CLLI>"+equi.getCLLI()+"</CLLI>"
						+ "<Cluster>"+equi.getCluster()+"</Cluster>"
						+ "<Modelo>"+equi.getModelo()+"</Modelo>"
						+ "<Division>"+equi.getDivision()+"</Division>"
						+ "<CLEI>"+equi.getCLEI()+"</CLEI>"
						+ "<TipoNodoTelmex>"+equi.getTipoNodoTelmex()+"</TipoNodoTelmex>"
						+ "<OSPF>"+equi.getOSPF()+"</OSPF>"
						+ "<Repisa>"+equi.getRepisa()+"</Repisa>"
						+ "<IPSistema>"+equi.getIPSistema()+"</IPSistema>"
						+ "<IPGestion>"+equi.getIPGestion()+"</IPGestion>"
						+ "<EstadoAprovisionamiento>"+equi.getEstadoAprovisionamiento()+"</EstadoAprovisionamiento>"
						+ "<FechaGestion>"+equi.getFechaGestion()+"</FechaGestion>"
						+ "<FolioOrdenTrabajo>"+equi.getFolioOrdenTrabajo()+"</FolioOrdenTrabajo>"
						+ "<Notas>"+equi.getNotas()+"</Notas>"
						+ "<VersionSistemaOperativo>"+equi.getVersionSistemaOperativo()+"</VersionSistemaOperativo>"
						+ "<TipoGestion>"+equi.getTipoGestion()+"</TipoGestion>"
						+ "<VLANGestion>"+equi.getVLANGestion()+"</VLANGestion>"
						+ "<ConexionPorTunel>"+equi.getConexionPorTunel()+"</ConexionPorTunel>"
						+ "<SwitchRCDT>"+equi.getSwitchRCDT()+"</SwitchRCDT>"
						+ "<PuertoRCDT>"+equi.getPuertoRCDT()+"</PuertoRCDT>"
						+ "<Velocidad>"+this+"</Velocidad>"
						+ "<FolioRCDT>"+equi.getVelocidad()+"</FolioRCDT>"
						+ "<PEP_Element_ID>"+equi.getPEP_Element_ID()+"</PEP_Element_ID>"
						+ "<FechaBaja>"+equi.getFechaBaja()+"</FechaBaja>"
						+ "<FechaAlta>"+equi.getFechaAlta()+"</FechaAlta>"
						+ "<FechaCambio>"+equi.getFechaCambio()+"</FechaCambio>"
						+ "<Proveedor>"+equi.getProveedor()+"</Proveedor>"
						+ "</PeEquipo>";
			
			return cadenaXml;
			}
		
	}

