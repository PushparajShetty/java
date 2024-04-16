package com.code.rest.service.impl;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.rest.entity.Ticket;
import com.code.rest.repository.TicketRepository;
import com.code.rest.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {
	@Autowired 
	TicketRepository rep;
	public Boolean Valid(String s) {
	    List<Ticket> tickets = rep.findByName(s);
	    
	    if (tickets != null && !tickets.isEmpty()) {
	    	
	        LocalDateTime currentTime = LocalDateTime.now();
	        for (Ticket ticket : tickets) {
	        	System.out.println("ticket there"+ticket.getStatus());
	            if (ticket.getStatus()) {
	                LocalDateTime boughtTime = ticket.getBoughtTime();
	                long hoursDifference = ChronoUnit.HOURS.between(boughtTime, currentTime);
	                System.out.println(hoursDifference);
	                if (hoursDifference > 24) {
	                    // Set status to false if bought more than 24 hours ago
	                    ticket.setStatus(false);
	                    rep.save(ticket);
	                } else {
	                    // Return false if there is a ticket bought within 24 hours and has status true
	                    return false;
	                }
	            }
	        }
	    }
	    return true;
	}
	
}
