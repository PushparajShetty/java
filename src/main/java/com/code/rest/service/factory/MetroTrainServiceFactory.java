package com.code.rest.service.factory;

import org.springframework.beans.factory.annotation.Autowired;

import com.code.rest.repository.GreenLaneMetroTrainRepository;
import com.code.rest.repository.PurpleLaneMetroTrainRepository;
import com.code.rest.service.MetroTrainService;
import com.code.rest.service.impl.GreenLaneMetroTrainServiceImpl;
import com.code.rest.service.impl.PurpleLaneMetroTrainServiceImpl;

public class MetroTrainServiceFactory {

    private final GreenLaneMetroTrainRepository greenRepository;
    private final PurpleLaneMetroTrainRepository purpleRepository;

    @Autowired
    public MetroTrainServiceFactory(GreenLaneMetroTrainRepository greenRepository, PurpleLaneMetroTrainRepository purpleRepository) {
        this.greenRepository = greenRepository;
        this.purpleRepository = purpleRepository;
    }

    
	public MetroTrainService getService(String laneType) {
        switch (laneType) {
            case "Green":
                return new GreenLaneMetroTrainServiceImpl(greenRepository);
            case "Purple":
                return new PurpleLaneMetroTrainServiceImpl(purpleRepository);
            default:
                throw new IllegalArgumentException("Invalid lane type");
        }
    }
}
