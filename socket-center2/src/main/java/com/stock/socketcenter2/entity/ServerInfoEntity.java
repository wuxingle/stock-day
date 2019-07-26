package com.stock.socketcenter2.entity;

import lombok.Data;


@Data
public class ServerInfoEntity {
	
	public String server_ip="";
	public String server_ip2="";
	public int server_port=8600;
	public String msfsPrior="";
	public String msfsBackup="";

	
}
