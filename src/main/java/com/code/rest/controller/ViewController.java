package com.code.rest.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.code.rest.entity.GreenLaneMetroTrain;
import com.code.rest.entity.GreenStation;
import com.code.rest.entity.PurpleLaneMetroTrain;
import com.code.rest.entity.PurpleStation;
import com.code.rest.entity.Route;
import com.code.rest.entity.Station;
import com.code.rest.repository.GreenStationRepository;
import com.code.rest.service.MetroTrainService;
import com.code.rest.service.RouteService;
import com.code.rest.service.StationService;

@Controller
@RequestMapping("/view/")
public class ViewController {
	
	@Autowired
	RouteService rot;
	
	@Autowired
	MetroTrainService metro;
	
	@Autowired
	StationService st;
	
	@GetMapping("/1")
	public String getRoutes(Model model) {
		List<String> routeNames = new ArrayList<>();
		List<Route> routes = rot.getAll();
		for (Route route : routes) {
			routeNames.add(route.getName());
		}
		model.addAttribute("routes", routeNames);
		return "routes";
	}
	@GetMapping("/2")
	public String getStation(Model model) {
		List<String> stationNames = new ArrayList<>();
		List<GreenStation> station1 = st.getGreenStations();
		for (GreenStation route : station1) {
			stationNames.add(route.getName());
		}
		List<PurpleStation> station2 = st.getPurpleStations();
		for (PurpleStation route : station2) {
			stationNames.add(route.getName());
		}
		model.addAttribute("routes", stationNames);
		return "routes";
	}
	
	@GetMapping("/3")
	public String getTrains(Model model) {
		List<Long> trainNames = new ArrayList<>();
		List<GreenLaneMetroTrain> train1 = metro.getGreen();
		List<PurpleLaneMetroTrain> train2 = metro.getPurple();
		
		for (GreenLaneMetroTrain route : train1) {
			trainNames.add(route.getMid());
		}
		for (PurpleLaneMetroTrain route : train2) {
			trainNames.add(route.getMid());
		}
		
		model.addAttribute("routes", trainNames);
		return "routes";
	}
}
