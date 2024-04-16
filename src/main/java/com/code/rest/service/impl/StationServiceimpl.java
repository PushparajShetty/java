package com.code.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.rest.entity.GreenStation;
import com.code.rest.entity.PurpleStation;
import com.code.rest.repository.GreenStationRepository;
import com.code.rest.repository.PurpleStationRepository;
import com.code.rest.service.StationService;

@Service
public class StationServiceimpl implements StationService {
	
	@Autowired
	GreenStationRepository rep1;
	
	@Autowired
	PurpleStationRepository rep2;
	
	public List<GreenStation> getGreenStations(){
		return rep1.findAll();
	}
	public List<PurpleStation> getPurpleStations(){
		return rep2.findAll();
	}
	
	}
	


