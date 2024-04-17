package com.code.rest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.code.rest.entity.PurpleLaneMetroTrain;
import com.code.rest.repository.PurpleLaneMetroTrainRepository;
import com.code.rest.service.MetroTrainService;

@Service
public class PurpleLaneMetroTrainServiceImpl implements MetroTrainService {

    private final PurpleLaneMetroTrainRepository repository;

    @Autowired
    public PurpleLaneMetroTrainServiceImpl(PurpleLaneMetroTrainRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<PurpleLaneMetroTrain> getTrains() {
        return repository.findAll();
    }
}