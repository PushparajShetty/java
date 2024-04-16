package com.code.rest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="GSTATION")
public class GreenStation implements Station{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long sid;
	private String name;

	
	
	public GreenStation() {
		super();
	}
	public GreenStation(String name, String route) {
		super();
		this.name = name;
		
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
	@Override
	public void update() {
		System.out.println("This is a green lane Station");
	}
	

}
