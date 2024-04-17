package com.code.rest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.code.rest.entity.GreenLaneMetroTrain;
import com.code.rest.repository.GreenLaneMetroTrainRepository;
import com.code.rest.service.MetroTrainService;

@Service
public class GreenLaneMetroTrainServiceImpl implements MetroTrainService {

    private final GreenLaneMetroTrainRepository repository;

    @Autowired
    public GreenLaneMetroTrainServiceImpl(GreenLaneMetroTrainRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<GreenLaneMetroTrain> getTrains() {
        return repository.findAll();
    }
}
