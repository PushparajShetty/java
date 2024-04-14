package com.code.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.rest.entity.GreenLaneMetroTrain;
import com.code.rest.entity.PurpleLaneMetroTrain;
import com.code.rest.repository.GreenLaneMetroTrainRepository;
import com.code.rest.repository.PurpleLaneMetroTrainRepository;
import com.code.rest.service.MetroTrainService;

@Service
public class MetroTrainServiceimpl  implements MetroTrainService{
	@Autowired
	GreenLaneMetroTrainRepository rep1;
	
	@Autowired
	PurpleLaneMetroTrainRepository rep2;
	
	public List<GreenLaneMetroTrain> getGreen(){
		return rep1.findAll();
		}
	public List<PurpleLaneMetroTrain> getPurple(){
		return rep2.findAll();
	}
	
	

}
