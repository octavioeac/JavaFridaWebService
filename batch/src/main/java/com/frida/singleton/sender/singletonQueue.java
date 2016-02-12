package com.frida.singleton.sender;

import java.util.Hashtable;

import javax.jms.DeliveryMode;
import javax.jms.JMSException;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueReceiver;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;

import com.ibm.mq.jms.JMSC;
import com.ibm.mq.jms.MQQueueConnectionFactory;

public class singletonQueue {

	public static singletonQueue _ins;
	static MQQueueConnectionFactory qcf = new MQQueueConnectionFactory();
	static parametrosQueue objet_conec=new parametrosQueue();
	
	
	public singletonQueue(){
				
	}
	
public static synchronized singletonQueue instancia(){
	if(_ins==null){
		_ins=new singletonQueue();	
		
	}
	return _ins;
}

 @SuppressWarnings("deprecation")
public synchronized String mandarMensaje(String cadenaxml){

		QueueConnection  con =null;
		QueueSession session =null;
		Queue queue = null;
		QueueSender sender =null;
		QueueReceiver receiver =null;		
		String correlID=""; 
		Hashtable resp = new Hashtable(0);
		idCorrelationMensaje idC=new idCorrelationMensaje();
		generadorFecha ran=new generadorFecha();
		try{
			
			qcf.setTransportType(JMSC.MQJMS_TP_CLIENT_MQ_TCPIP);
	     	qcf.setChannel(objet_conec.getChannel());/* Channel*/ 	
			qcf.setHostName(objet_conec.getHostName());
			qcf.setPort(objet_conec.getPort());
		   qcf.setQueueManager(objet_conec.getQueueManager());
					
	  con = (QueueConnection)qcf.createQueueConnection(objet_conec.getUsername(),objet_conec.getPassword());

	  
	  con.start();
		    session = (QueueSession)con.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
		
		    
		    queue = session.createQueue(objet_conec.getDestination());//qg1//cola
		    
		    TextMessage message = session.createTextMessage();
		    
		    message.setJMSDeliveryMode(DeliveryMode.PERSISTENT);
			message.setJMSExpiration(0);
			        
			System.err.println("1 :");
			message.setText(cadenaxml);
		   sender = session.createSender(queue);
		     message.setJMSCorrelationID(ran.gener());
			String correla=message.getJMSCorrelationID();
			System.out.println(correla);
		   
			sender.send(message);
			System.err.println("Se Envio el Mensaje a MQ :"+cadenaxml+"::_____Acknolage___::"+message.getJMSMessageID());
			System.err.println("correlationID Despues..:"+message.getJMSCorrelationID());
			idC.setCorreID(message.getJMSCorrelationID());
			
			try{ if(sender!=null){ 
				sender.close(); 
				} sender=null;
				}
			catch(Exception e){ 
				sender=null; 
				}
			try{ 
				if(session!=null){ 
					session.close();
					} session=null;
					}catch(Exception e)
			{ 
			session=null; 
			}
			try{ 
				if(con!=null){
					con.close();
					}
				con=null; 
					}catch(Exception e){ 
						con=null;
						}
			
		
		}catch(JMSException jms_e){
			
		}
		

		return idC.getCorreID();
 }





}
