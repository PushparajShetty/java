package com.code.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.rest.entity.Station;
import com.code.rest.repository.StationRepository;
import com.code.rest.service.StationService;

@Service
public class StationServiceimpl implements StationService {
	
	@Autowired
	StationRepository rep;
	public List<Station> getStations(){
		return rep.findAll();
	}

}
