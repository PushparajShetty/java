package com.code.rest.service;

import java.util.List;

import com.code.rest.entity.GreenLaneMetroTrain;
import com.code.rest.entity.PurpleLaneMetroTrain;

public interface MetroTrainService {
	public List<GreenLaneMetroTrain> getGreen();
	public List<PurpleLaneMetroTrain> getPurple();
	

}
