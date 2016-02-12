package com.frida.singleton.sender;

public class parametrosQueue {
    private String hostName;
    private int port;
    private String channel;
    private String queueManager;
    private String destination;
    private String transportType;
    private String username;
	private String password;
	
	public parametrosQueue(){ 
	  this.hostName="10.94.233.162";
	  this.port=2414;
	  this.channel="SYSTEM.BKR.CONFIG";
	  this.queueManager="MB8QMGR";
      this.destination="QL.EVFRIDA";
      //this.destination="EV.RCFRIDA";
	  //this.destination="QL.FRIDA.OUT";
	  this.transportType="CLIENT";
	  this.username="mqm";
	  this.password="mqm";
	  	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getQueueManager() {
		return queueManager;
	}

	public void setQueueManager(String queueManager) {
		this.queueManager = queueManager;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getTransportType() {
		return transportType;
	}

	public void setTransportType(String transportType) {
		this.transportType = transportType;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
