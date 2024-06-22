package com.springwebapp;

import org.springframework.stereotype.Component;

@Component
public class Bus {
	
	private String busName;
	private String location;
	private int ticketPrice;
	
	public Bus() {
		
	}
	
	public Bus(String busName, String location, int ticketPrice) {
		super();
		this.busName = busName;
		this.location = location;
		this.ticketPrice = ticketPrice;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
}
