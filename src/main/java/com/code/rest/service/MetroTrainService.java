package com.code.rest.service;

import java.util.List;
import com.code.rest.entity.MetroTrain;

public interface MetroTrainService {
    List<? extends MetroTrain> getTrains();
}
