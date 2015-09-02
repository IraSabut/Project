package com.exposit.sjc.domain.service;


import com.exposit.sjc.app.repository.entity.AutorizationDataEntity;

import java.util.List;

public interface AutorizationDataService {
    List<AutorizationDataEntity> getAutorizationDaties();
    AutorizationDataEntity getAutorizationDataByID(Long autorizationDatId);
    void save(AutorizationDataEntity autorizationDataEntity);
}
