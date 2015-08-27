package com.exposit.sjc.service;


import com.exposit.sjc.app.repository.dao.AuthorDao;
import com.exposit.sjc.app.repository.dao.AutorizationDataDao;
import com.exposit.sjc.app.repository.entity.AutorizationDataEntity;
import com.exposit.sjc.domain.service.AuthorizationDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class AutorisationDataServiceImpl implements AuthorizationDataService{
    @Autowired(required = false)
    private AutorizationDataDao autorizationDataRepository;


    @Override
    public List<AutorizationDataEntity> getAutorizationDaties() {
        return null;
    }

    @Override
    public AutorizationDataEntity getAutorizationDataByID(Long autorizationDatId) {
        return null;
    }
}
