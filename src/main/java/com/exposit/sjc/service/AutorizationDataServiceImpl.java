package com.exposit.sjc.service;

import com.exposit.sjc.app.repository.dao.AutorizationDataDao;
import com.exposit.sjc.app.repository.entity.AutorizationDataEntity;
import com.exposit.sjc.domain.model.AutorizationData;
import com.exposit.sjc.domain.service.AutorizationDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AutorizationDataServiceImpl implements AutorizationDataService{
    @Autowired
    private AutorizationDataDao autorizationDataDao;
    @Override
    public List<AutorizationDataEntity> getAutorizationDaties() {
        return null;
    }

    @Override
    public AutorizationDataEntity getAutorizationDataByID(Long autorizationDatId) {
        return null;
    }

    @Override
    public void save(AutorizationDataEntity autorizationDataEntity) {

    }
}
