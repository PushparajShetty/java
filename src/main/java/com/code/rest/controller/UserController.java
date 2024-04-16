package com.code.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.code.rest.entity.GreenStation;
import com.code.rest.entity.PurpleStation;
import com.code.rest.entity.Sample;
import com.code.rest.service.StationService;
import com.code.rest.service.TicketService;

@Controller
@RequestMapping("/user/")
public class UserController {
    @Autowired
    TicketService tick;
    @Autowired
    StationService st;
    
    @GetMapping("/1/{mail}")
    public String book(@PathVariable String mail, Model model) {
        System.out.println("hello working");
        model.addAttribute("mail", mail);
        if (tick.Valid(mail)) {
        	List<String> stationNames = new ArrayList<>();
    		List<GreenStation> station1 = st.getGreenStations();
    		for (GreenStation route : station1) {
    			stationNames.add(route.getName());
    		}
    		List<PurpleStation> station2 = st.getPurpleStations();
    		for (PurpleStation route : station2) {
    			stationNames.add(route.getName());
    		}
    		model.addAttribute("station", stationNames);
            return "ticket"; // Redirect to success page if ticket is valid
        } else {
            return "user"; // Redirect to error page if ticket is not valid
        }
    }
    
//    @PostMapping("/book/{mail}")
//    public String movetopay(@PathVariable String mail,Model m,@RequestBody Sample s) {
//    	
//    	
//    	m.addAttribute("mail", mail);
//    	m.addAttribute("from", s.getFrom());
//    	m.addAttribute("to", s.getTo());
//    	System.out.println(s.getFrom()+s.getTo());
//    	return "rec";
//    	
//    }
    @PostMapping("/book/{mail}")
    public String handleFormSubmission(@PathVariable String mail, Sample s, BindingResult result, Model model) {
    	System.out.println(s.getFrom()+s.getTo());
    	return "rec";
        // Your logic to handle the form submission goes here
    }



}
