package com.code.rest.service;

import java.util.List;

import com.code.rest.entity.GreenStation;
import com.code.rest.entity.PurpleStation;

public interface StationService {
	public List<GreenStation> getGreenStations();
	public List<PurpleStation> getPurpleStations();
}
