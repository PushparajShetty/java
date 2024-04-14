package com.code.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.rest.entity.Station;


public interface StationRepository extends JpaRepository<Station, Long>{
	

}
