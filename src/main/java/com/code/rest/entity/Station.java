package com.code.rest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="STATION")
public class Station {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long sid;
	private String name;
	private String route;
	
	
	public Station() {
		super();
	}
	public Station(String name, String route) {
		super();
		this.name = name;
		this.route = route;
	}
	public long getSid() {
		return sid;
	}
	public void setSid(long sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	
	

}
