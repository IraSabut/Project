
package com.exposit.sjc.domain.service;

import com.exposit.sjc.app.repository.entity.AutorizationDataEntity;
import com.exposit.sjc.app.repository.entity.BookEntity;

import java.util.List;

public interface AuthorizationDataService {
    List<AutorizationDataEntity> getAutorizationDaties();
    AutorizationDataEntity getAutorizationDataByID(Long autorizationDatId);
}
