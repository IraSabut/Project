package com.exposit.sjc.app.repository.impl;

import com.exposit.sjc.app.repository.dao.AutorizationDataDao;
import com.exposit.sjc.app.repository.entity.AutorizationDataEntity;
import com.exposit.sjc.app.repository.hibernate.AbstractHibernateDao;
import org.springframework.stereotype.Repository;

@Repository
public class AutorizationDataRepository extends AbstractHibernateDao<AutorizationDataEntity, Long> implements AutorizationDataDao {

}
