package com.exposit.sjc.app.repository.impl;


import com.exposit.sjc.app.repository.dao.AutorizationDataDao;

import com.exposit.sjc.app.repository.entity.AutorizationDataEntity;
import com.exposit.sjc.app.repository.entity.ContractEntity;
import com.exposit.sjc.app.repository.hibernate.AbstractHibernateDao;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class AutorisationDataRepository extends AbstractHibernateDao<AutorizationDataEntity, Long> implements AutorizationDataDao {
    @Override
    public AutorizationDataEntity findById(Long autorizationDataId) {
        Criteria cr = getSession().createCriteria(AutorizationDataEntity.class, "AutorizationDataEntity")
                .add(Restrictions.eq("idAutorizationData", autorizationDataId));
        return (AutorizationDataEntity) cr.uniqueResult();
    }


}