package com.code.rest.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TICKET")
public class Ticket {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long pnr;
	
	private Boolean status;
	private String type;
	private long st_id;
	private long  dt_id;
	private long pid;
	public Ticket(long pnr, Boolean status, String type, long st_id, long dt_id, long pid) {
		super();
		
		this.status = status;
		this.type = type;
		this.st_id = st_id;
		this.dt_id = dt_id;
		this.pid = pid;
	}
	@Override
	public String toString() {
		return "Ticket [pnr=" + pnr + ", status=" + status + ", type=" + type + ", st_id=" + st_id + ", dt_id=" + dt_id
				+ ", pid=" + pid + "]";
	}
	
	
	
	

}
