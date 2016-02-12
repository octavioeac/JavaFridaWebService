package www.frida.modelo.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.frida.xmlArmados.PeEquipoXmlCadena;
import com.frida.xmlPojo.PeEquipoXml;

import www.frida.modelo.HibernateUtil;
import www.frida.modelo.CatAnillo;


public class catAnilloBusqueda {
	
	
	public String getPeEquipo(String idNodo,String movimiento){
		PeEquipoXml obj=new PeEquipoXml();
		PeEquipoXmlCadena cadenaxml=new PeEquipoXmlCadena();
		 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		 Session newSession = sessionFactory.openSession();
		 newSession.beginTransaction();
		 Criteria cr = newSession.createCriteria(CatAnillo.class);
		  Criterion c1=Restrictions.eq("idNodo",idNodo);
		  cr.add(c1);
		
		  List<CatAnillo> result = cr.list();
		  System.out.println(result.size());
		  
		  
		  for(CatAnillo j:result ){
			  
			  
			  obj.setID_Nodo(j.getIdNodo());
			  obj.setID_Nodo_Nuevo(movimiento);
			  obj.setMovimiento(j.getMovimiento());
			  obj.setCLLIEdificio(j.getClliCentral());
			  obj.setUbicacionEquipo(j.getUbiNodoAdm());
			  obj.setCLLI(j.getClliEquipo());
			  obj.setCluster(j.getAnillo());
			  obj.setModelo(j.getRepadmConxadsl());
			  obj.setDivision(j.getDivision());
			  obj.setTipoNodoTelmex(j.getTipoCluster());
			  obj.setOSPF(j.getOspf());
			  obj.setRepisa(j.getRepisa());
			  obj.setIPSistema(j.getIpSistema());
			  obj.setIPGestion(j.getIpGestion());
			  obj.setEstadoAprovisionamiento(j.getEstatusCns());
			  obj.setFechaGestion(j.getFechaEstatusCns());
			  obj.setFolioOrdenTrabajo(j.getNumOtFrida());
			  obj.setNotas(j.getObservaciones());
			  obj.setVersionSistemaOperativo(j.getVersionNodo());
			  obj.setSwitchRCDT(j.getSwitchRcdt());
			  obj.setPuertoRCDT(j.getPtoRcdt());
              obj.setFechaAlta(j.getFechaAlta());
              obj.setProveedor(j.getProveedorTx());
			  System.out.println(j.getIdNodo());
			  
		  }
		  
		  newSession.getTransaction().commit();  
		  
		System.out.println(cadenaxml.getXmlEQUIPO(obj));
		  HibernateUtil.close();
		
			return cadenaxml.getXmlEQUIPO(obj);
		
	}
	
public static void main(String args[]){
	catAnilloBusqueda h=new catAnilloBusqueda();
	h.getPeEquipo("CE_9S4IRA_001CCEN","");
}
	
	
}
