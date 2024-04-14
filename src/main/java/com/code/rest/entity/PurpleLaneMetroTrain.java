package com.code.rest.entity;

import java.sql.Time;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="METRO2")
public class PurpleLaneMetroTrain implements MetroTrain{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long mid;
	private String source_name;
	private String dest_name;
	private String route_name;
	private Time startTime;
	private Time endTime;
	
	public PurpleLaneMetroTrain() {
		super();
	}

	public PurpleLaneMetroTrain(String source_name, String dest_name, String route_name, Time startTime, Time endTime) {
		super();
		this.source_name = source_name;
		this.dest_name = dest_name;
		this.route_name = route_name;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public long getMid() {
		return mid;
	}

	public void setMid(long mid) {
		this.mid = mid;
	}

	public String getSource_name() {
		return source_name;
	}

	public void setSource_name(String source_name) {
		this.source_name = source_name;
	}

	public String getDest_name() {
		return dest_name;
	}

	public void setDest_name(String dest_name) {
		this.dest_name = dest_name;
	}

	public String getRoute_name() {
		return route_name;
	}

	public void setRoute_name(String route_name) {
		this.route_name = route_name;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	@Override
    public void updateLocation(String station) {
        // Implement updateLocation for purple lane metro trains
        System.out.println("Purple lane metro train with ID " + mid + " is now at " + station);
        
    }
	
	
}
