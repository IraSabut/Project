package com.exposit.sjc.app.repository.impl;

import com.exposit.sjc.app.repository.dao.ContractDao;
import com.exposit.sjc.app.repository.entity.ContractEntity;
import com.exposit.sjc.app.repository.hibernate.AbstractHibernateDao;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 * Created by Админ on 25.08.2015.
 */
@Repository
public class ContractRepository extends AbstractHibernateDao<ContractEntity, Long> implements ContractDao {
    @Override
    public ContractEntity findById(Long contractId) {
        Criteria cr = getSession().createCriteria(ContractEntity.class, "ContractEntity")
                .add(Restrictions.eq("idContract", contractId));
        return (ContractEntity) cr.uniqueResult();
    }


}
