package com.code.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.rest.entity.GreenLaneMetroTrain;
import com.code.rest.entity.PurpleLaneMetroTrain;


public interface PurpleLaneMetroTrainRepository extends JpaRepository<PurpleLaneMetroTrain, Long>{

}
